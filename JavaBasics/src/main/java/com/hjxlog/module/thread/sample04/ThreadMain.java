package com.hjxlog.module.thread.sample04;


public class ThreadMain {

    private final static Object lock = new Object();

    private final static Boolean flag = false;

    public static void main(String[] args) {
//        synchronized (lock) {
//            try {
//                while (flag) {
//                    // 条件满足
//                    lock.wait();
//                }
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

}
