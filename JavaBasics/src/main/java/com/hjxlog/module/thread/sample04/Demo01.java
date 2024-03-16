package com.hjxlog.module.thread.sample04;

public class Demo01 {

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Thread A start...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(()->{
            System.out.println("Thread B start...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();


    }

}
