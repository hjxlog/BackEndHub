package com.hjxlog.module.thread.sample03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateThread {

    public static void main(String[] args) {
        // 1、继承Thread重写run方法
        Thread01 thread01 = new Thread01();
        thread01.start();
        // 2、实现Runnable接口
        RunnableThread runnableThread = new RunnableThread();
        new Thread(runnableThread).start();
        new Thread(runnableThread).start();
        // 3、实现Callable接口
        FutureTask<String> futureTask = new FutureTask<>(new CallerThread());
        new Thread(futureTask).start();
        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

}
