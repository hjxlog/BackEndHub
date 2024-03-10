package com.hjxlog.module.lambda.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaDemo02 {

    public static void main(String[] args) {
        // 数组创建Stream
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> arrStream = Arrays.stream(arr);
        arrStream.forEach(System.out::println);
        // 集合创建stream
        List<String> list = Arrays.asList(arr);
        Stream<String> listStream = list.stream();
        listStream.forEach(System.out::println);
    }

}
