package com.hjxlog.module.thread.sample03;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口创建线程...");
        System.out.println("具体的业务代码...");
    }
}
