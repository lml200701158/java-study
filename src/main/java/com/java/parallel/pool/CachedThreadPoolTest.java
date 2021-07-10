package com.java.parallel.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {
    public static void main(String args[]) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool.execute(new Runnable(){
            public void run() {
                System.out.println(Thread.currentThread().getName() + "--->运行");
            }
        });
        cachedThreadPool.shutdown();
    }
}
