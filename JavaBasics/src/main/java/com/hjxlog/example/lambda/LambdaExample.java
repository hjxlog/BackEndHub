package com.hjxlog.example.lambda;

import com.hjxlog.service.Command;

public class LambdaExample {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread start...");
            }
        }).start();

        // 改写成lambda
        new Thread(() -> {
            System.out.println("lambda thread start...");
        }).start();

        // 使用Lambda表达式实现SumUnit接口
        Command command = () -> System.out.println("Executing the sum unit");

        // 调用execute方法
        command.execute();

    }

}
