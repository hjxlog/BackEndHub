package com.hjxlog.module.thread.sample04;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerExample {

    private static Object lock = new Object();
    private static final int CAPACITY = 5;
    private final List<Integer> queue = new LinkedList<>();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            // 获取锁
            synchronized (lock) {
                // 如果队列满了，等待消费者消费
                while (queue.size() == CAPACITY) {
                    lock.wait();
                }
                // 生产一个元素，加入到队列中
                queue.add(value);
                System.out.println("Produced: " + value);
                // 唤醒等待的消费者
                lock.notify();
                // 模拟生产耗时
                Thread.sleep(1000);
                value++;
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (lock) {
                // 如果队列为空，等待生产者生产
                while (queue.isEmpty()) {
                    lock.wait();
                }
                // 消费一个元素，从队列中移除
                int value = queue.remove(0);
                System.out.println("Consumed: " + value);
                // 唤醒等待的生产者
                lock.notify();
                // 模拟消费耗时
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumerExample example = new ProducerConsumerExample();

        Thread producerThread = new Thread(() -> {
            try {
                example.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                example.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}