package com.hjxlog.module.thread.sample04;

public class InterruptedExample {

    public static class InterruptedThread extends Thread {

        public void run() {
            // 检查中断状态
            for (int i = 0; i < 5 && !Thread.interrupted(); i++) {
                System.out.println(i + " - Still running");
                // 模拟工作
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted during sleep");
                    // 重新设置中断状态
                    interrupt();
                }
            }
            System.out.println("Exiting gracefully");
        }
    }

    public static void main(String[] args) {
        InterruptedThread thread = new InterruptedThread();
        thread.start();

        // 给点时间让线程运行
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 中断线程
        thread.interrupt();
    }
}