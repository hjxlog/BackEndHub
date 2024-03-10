package com.hjxlog.module.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // 假设有一个 ArrayList
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // 获取前 20 个元素
        List<Integer> firstTwenty = numbers.subList(0, Math.min(numbers.size(), 20));

        // 输出结果
        System.out.println("前20个元素：");
        System.out.println(firstTwenty);
    }
}