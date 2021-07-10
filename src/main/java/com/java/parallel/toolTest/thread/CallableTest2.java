package com.java.parallel.toolTest.thread;

import java.util.concurrent.*;

public class CallableTest2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executors = Executors.newCachedThreadPool();
        Future<String> future;
        for(int i = 0; i < 5 ; i++){
            // 直接把Callable对象扔给线程池，由线程池执行
            future = executors.submit(new CallableImpl(Integer.toString(i)));
            System.out.println(future.get());
        }
        executors.shutdown();
    }
}

class CallableImpl implements Callable<String> {
    private String callableName;
    public CallableImpl(String callableName) {
        this.callableName = callableName;
    }
    @Override
    public String call() throws Exception {
        return "当前Callable名为: " + callableName;
    }
}