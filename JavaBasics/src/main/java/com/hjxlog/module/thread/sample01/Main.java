package com.hjxlog.module.thread.sample01;

public class Main {

    private static final Consumer consumer = new Consumer();

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int finalI = i;
//            new Thread(() -> {
//                consumer.printName(finalI + "");
//            }).start();
//            new Thread(() -> {
//                Consumer consumer = new Consumer();
//                consumer.printName(finalI + "");
//            }).start();

            new Thread(() -> {
                consumer.printName(finalI + "");
            }).start();

        }
    }

}
