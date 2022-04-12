package com.java.parallel.share;
import com.java.parallel.pool.ofc.TaskProcessUtil;
import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultiThreadProcess {

    /**
     * 获取切割好的原始数据
     * @param batchSize 单次处理的数量
     * @return
     */
    private static List<List<Integer>> getProcessData(Integer batchSize) {
        List<Integer> originData = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            originData.add(i);
        }
        List<List<Integer>> processData = ListUtils.partition(originData, batchSize);
        return processData;
    }

    /**
     * 单线程数据处理
     * @param req
     * @return
     */
    private static List<String> processOneThread(List<Integer> req) throws InterruptedException {
        List<String> output = new ArrayList<>();
        for (Integer value : req) {
            output.add(String.valueOf(value +  1));
        }
        Thread.sleep(2000);
        return output;
    }


    /**
     * 多线程调用（错误使用姿势）
     * @param batchSize
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static List<String> processByWrongMultiThread(Integer batchSize) throws ExecutionException, InterruptedException {
        List<String> output = new ArrayList<>();
        List<List<Integer>> batchProcessData = getProcessData(batchSize);

        List<FutureTask<List<String>>> futureTaskList = new ArrayList<>();
        for (List<Integer> processData : batchProcessData) {
            Callable<List<String>> callable = () -> processOneThread(processData);
            FutureTask<List<String>> futureTask = new FutureTask<>(callable);
            futureTaskList.add(futureTask);
        }

        for (FutureTask<List<String>> futureTask : futureTaskList)  {
            futureTask.run();
        }

        for (FutureTask futureTask : futureTaskList) {
            List<String> processData = (List<String>) futureTask.get();
            output.addAll(processData);
        }
        return output;
    }

    /**
     * 多线程调用
     * @param batchSize
     * @return
     * @throws ExecutionException
     * @throws InterruptedException
     */
    private static List<String> processByMultiThread(Integer batchSize) throws ExecutionException, InterruptedException {
        List<String> output = new ArrayList<>();

        // 获取分批数据
        List<List<Integer>> batchProcessData = getProcessData(batchSize);

        // 启动线程
        List<FutureTask<List<String>>> futureTaskList = new ArrayList<>();
        for (List<Integer> processData : batchProcessData) {
            Callable<List<String>> callable = () -> processOneThread(processData);
            FutureTask<List<String>> futureTask = new FutureTask<>(callable);
            new Thread(futureTask).start();  // 启动线程
            futureTaskList.add(futureTask);
        }

        // 获取线程返回的数据
        for (FutureTask futureTask : futureTaskList) {
            List<String> processData = (List<String>) futureTask.get();
            output.addAll(processData);
        }
        return output;
    }

    /**
     * 线程池处理
     * @param batchSize
     * @return
     */
    private static List<String> processByPool(Integer batchSize) throws ExecutionException, InterruptedException {
        List<String> output = new ArrayList<>();
        List<List<Integer>> batchProcessData = getProcessData(batchSize);

        // 1. 使用线程池
        ExecutorService executorService = new ThreadPoolExecutor(3, 5, 60,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        // 2. 创建执行任务
        List<Future<List<String>>> futureList = new ArrayList<>();
        for (List<Integer> processData : batchProcessData) {
            Callable<List<String>> callable = () -> processOneThread(processData);
            futureList.add(executorService.submit(callable));
        }

        for (Future futureTask : futureList) {
            List<String> processData = (List<String>) futureTask.get();
            output.addAll(processData);
        }
        return output;
    }

    /**
     * 线程池处理（单例模式）
     * @param batchSize
     * @return
     */
    private static List<String> processByPoolSingle(Integer batchSize) throws ExecutionException, InterruptedException {
        List<String> output = new ArrayList<>();

        List<List<Integer>> batchProcessData = getProcessData(batchSize);

        // 1. 使用线程池
        ExecutorService executorService = TaskProcessUtil.getOrInitExecutors("TEST_POOL", 3);

        // 2. 创建执行任务
        List<Future<List<String>>> futureList = new ArrayList<>();
        for (List<Integer> processData : batchProcessData) {
            Callable<List<String>> callable = () -> processOneThread(processData);
            futureList.add(executorService.submit(callable));
        }

        for (Future futureTask : futureList) {
            List<String> processData = (List<String>) futureTask.get();
            output.addAll(processData);
        }
        return output;
    }

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        List<String> output = processByWrongMultiThread(5);
        for (String i : output) {
            System.out.println(i);
        }
    }
}

