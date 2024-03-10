package com.hjxlog.module.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDataLossExample {
    private static final Map<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) {
        // 启动两个线程同时对HashMap进行写操作
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put("Key" + i, i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put("Key" + i, i * 10);
            }
        });

        thread1.start();
        thread2.start();

        // 等待两个线程执行完毕
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 打印HashMap的大小，预期结果是2000，但可能会小于这个值
        System.out.println("HashMap size: " + hashMap.size());
    }
}
