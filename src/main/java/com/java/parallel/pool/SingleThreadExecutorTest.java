package com.java.parallel.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorTest {
    public static void main(String args[]) {
        // 创建线程池对象，设置核心线程和最大线程数为1
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        singleThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is running.");
            }
        });
        singleThreadPool.shutdown();
    }
}
