package com.hjxlog.module.thread.sample01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer {

    private ThreadLocal<String> name = new ThreadLocal<>();

    public void printName(String param) {
        name.set(param); // 在当前线程内设置name的值
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // 设置中断标志
            throw new RuntimeException(e);      // 重新抛出异常
        }

        // 只会得到当前线程设置的name值，其他线程对其的更改不会影响到这里
        if (!name.get().equals(param)) {
            System.out.println("name:" + name.get() + ", param:" + param);
        }
    }

    private final Lock lock = new ReentrantLock();

//    private String name;
//
//    public synchronized void printName(String param) {
//        name = param;
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        if (!name.equals(param)) {
//            System.out.println("内容不一致，已被覆盖！name:" + name + ", param:" + param);
//        }
//    }

//    public void printName1(String param) {
//        lock.lock();
//        try {
//            name = param;
//            Thread.sleep(5);
//            if (!name.equals(param)) {
//                System.out.println("内容不一致，已被覆盖！name:" + name + ", param:" + param);
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } finally {
//            lock.unlock();
//        }
//    }

}
