package com.hjxlog.example.lambda;

public class LambdaExample {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread start...");
            }
        }).start();

        // 改写成lambda
    }

}
