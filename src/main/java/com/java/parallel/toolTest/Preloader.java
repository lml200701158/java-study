package com.java.parallel.toolTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Preloader {
    private final FutureTask<Cat> future = new FutureTask<Cat>(new Callable<Cat>() {
        @Override
        public Cat call() throws InterruptedException {
            Cat cat = new Cat();
            cat.setCatName("罗小黑");
            for (int i = 1; i <= 5; i ++) {
                // 睡眠1秒，方便大家看执行效果
                Thread.sleep(1000L);
                System.out.println("Sleep " + i + " 秒");
            }
            return cat;
        }
    });

    private final Thread thread = new Thread(future);

    public void start() {
        System.out.println("启动Start");
        thread.start();
    }

    public Cat get() throws ExecutionException, InterruptedException {
        Cat cat = null;
        try {
            System.out.println("开始获取数据！");
            // 阻塞，等待线程执行完毕
            cat = future.get();
            System.out.println("获取数据成功！");
        } catch (ExecutionException e) {
            // 异常处理，省略...
        }
        return cat;
    }
    
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        Preloader preloader = new Preloader();
        preloader.start();
        Cat cat = preloader.get();
        System.out.println(cat.toString());
    }
}
