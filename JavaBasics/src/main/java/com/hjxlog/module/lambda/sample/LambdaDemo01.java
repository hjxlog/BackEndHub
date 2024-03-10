package com.hjxlog.module.lambda.sample;

import java.util.function.IntPredicate;

public class LambdaDemo01 {
    public static void main(String[] args) {
        // 使用匿名内部类
        printEven(new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });

        printEven((int value) -> {
            return value % 2 == 0;
        });

        printEven((value) -> {
            return value % 2 == 0;
        });

        printEven(value -> {
            return value % 2 == 0;
        });

        printEven(value -> value % 2 == 0);

    }

    public static void printEven(IntPredicate predicate) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : array) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}
