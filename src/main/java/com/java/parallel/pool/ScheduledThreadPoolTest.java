package com.java.parallel.pool;

import java.util.concurrent.*;

public class ScheduledThreadPoolTest {
    public static void main(String args[]) {
        // 创建定时线程池
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        // 向线程池提交任务
        scheduledThreadPool.schedule(new Runnable(){
            public void run() {
                System.out.println(Thread.currentThread().getName() + "--->运行");
            }
        }, 5, TimeUnit.SECONDS); // 延迟5s后执行任务
        scheduledThreadPool.shutdown();
    }
}
