package com.hjxlog.module.thread.sample03;

public class Thread01 extends Thread {

    private String name;

    @Override
    public void run() {
        this.name = "hello";
        System.out.println("继承Thread的创建方式..." + this.name);
        System.out.println(this.getState());
    }
}
