package com.java.parallel.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {
    public static void main(String args[]) {
        // 创建线程池(核心线程数是3，最大线程数是5，超时时间是5秒)
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(5));

        // 向线程池提交任务
        for (int i = 0; i < threadPool.getCorePoolSize(); i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 2; j++) {
                        System.out.println(Thread.currentThread().getName() + ":" + j);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        // 关闭线程池
        threadPool.shutdown(); // 设置线程池的状态为SHUTDOWN，然后中断所有没有正在执行任务的线程
        // threadPool.shutdownNow(); // 设置线程池的状态为STOP，然后尝试停止所有的正在执行或暂停任务的线程，并返回等待执行任务的列表，该方法要慎用，容易造成不可控的后果
    }
}
