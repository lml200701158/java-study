package com.java.parallel.toolTest.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    private void callTest() {
        //这里指定返回String类型
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Callable 已经运行啦");
                return "this is Callable is running";
            }
        };
        FutureTask<String> futureTask = new FutureTask<String>(callable);
        futureTask.run();
        try {
            if (futureTask.isDone()){   //任务完成
                System.out.println(futureTask.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CallableTest test = new CallableTest();
        test.callTest();
    }
}


