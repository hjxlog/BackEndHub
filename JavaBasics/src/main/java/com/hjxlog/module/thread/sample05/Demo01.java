package com.hjxlog.module.thread.sample05;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            // 执行一些耗时的操作
//            return "Hello CompletableFuture";
//        });
//        String result = future.get(); // 阻塞等待任务执行完成并获取结果
//        System.out.println(result);
//
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            // 执行一些可能会出现异常的操作
//            int i = 1 / 0;
//            return "success";
//        }).handle((result, exception) -> {
//            if (exception != null) {
//                System.out.println("Task failed with exception: " + exception);
//                return "default value";
//            } else {
//                return result;
//            }
//        });
//        String result = future.get();
//        System.out.println(result);


        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "CompletableFuture");
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Java");

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);
        combinedFuture.get();

        StringJoiner joiner = new StringJoiner(" ");
        for (CompletableFuture<String> stringCompletableFuture : Arrays.asList(future1, future2, future3)) {
            String join = stringCompletableFuture.join();
            joiner.add(join);
        }
        String result = joiner.toString();
        System.out.println(result);

    }

}
