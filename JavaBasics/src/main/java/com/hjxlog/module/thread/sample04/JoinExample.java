package com.hjxlog.module.thread.sample04;

public class JoinExample {

    public static void main(String[] args) {
        // 创建一个线程
        Thread threadA = new Thread(() -> {
            try {
                System.out.println("Thread A is running.");
                // 模拟耗时任务
                Thread.sleep(2000);
                System.out.println("Thread A completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // 启动线程
        threadA.start();
        // 在主线程中调用 join
        try {
            System.out.println("Main thread waiting for Thread A to finish.");
            threadA.join();
            System.out.println("Main thread resumed after Thread A finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is running other tasks.");
    }
}