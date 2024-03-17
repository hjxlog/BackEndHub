package com.hjxlog.module.thread.sample04;

public class DeadLockExample {
    public static void main(String[] args) {
        // 创建资源 1
        Object resource1 = new Object();
        // 创建资源 2
        Object resource2 = new Object();

        Thread thread1 = new Thread(new MyRunnable(resource1, resource2), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(resource2, resource1), "Thread 2");

        thread1.start();
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        private Object resource1;
        private Object resource2;

        public MyRunnable(Object resource1, Object resource2) {
            this.resource1 = resource1;
            this.resource2 = resource2;
        }

        @Override
        public void run() {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " 获得了资源 1");

                try {
                    // 等待 1 秒，模拟线程执行其他操作
                    Thread.sleep(1000);

                    synchronized (resource2) {
                        System.out.println(Thread.currentThread().getName() + " 获得了资源 2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}