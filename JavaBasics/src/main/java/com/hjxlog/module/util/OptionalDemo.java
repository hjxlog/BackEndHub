package com.hjxlog.module.util;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalDemo {
    public static void main(String[] args) {
        Object obj = null;
//        obj = "sdf";
        Object test = Optional.ofNullable(obj).orElse("test");
        System.out.println(test);

        Optional<String> optionValue = Optional.of("option value");
        String value = optionValue.get();
        System.out.println("value = " + value);

        String s = optionValue.orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return "orElseGet";
            }
        });
        System.out.println("s = " + s);

        // 定义一个 Optional 对象
        Optional<Integer> optionalInteger = Optional.of(10);

// 使用 filter 方法过滤值
        Optional<Integer> filteredOptional = optionalInteger.filter(number -> number % 2 == 0);


        Integer integer = filteredOptional.get();
        System.out.println("integer = " + integer);

    }
}
