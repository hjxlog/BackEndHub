package com.hjxlog.module.thread.sample05;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Demo02 {

    // 创建一个固定大小为 3 的线程池
    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(new Date());
        List<CompletableFuture<Integer>> completableFutureList = new ArrayList<>();

        list.stream().forEach(i -> {
            CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> print(i), executor);
            completableFutureList.add(future);
        });

        List<Integer> collect = completableFutureList.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println(new Date());
    }

    private static int print(int i) {
        try {
            Thread.sleep(i * 100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return i;
    }

}
