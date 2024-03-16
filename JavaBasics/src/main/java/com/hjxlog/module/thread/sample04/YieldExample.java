package com.hjxlog.module.thread.sample04;

public class YieldExample {

    public static class WorkerThread implements Runnable {
        private String threadName;

        public WorkerThread(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + " is working step " + i);
                Thread.yield();
                // 模仿一些计算工作
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " has finished its work!");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new WorkerThread("Thread 1"));
        Thread t2 = new Thread(new WorkerThread("Thread 2"));

        // 启动两个线程
        t1.start();
        t2.start();
    }
}