package com.hjxlog.module.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Demo01 {
    public static void main(String[] args) {
        String str = null;
        String value = Optional.ofNullable(str).orElse("null value");
        System.out.println(value);

        Map<String, Object> map = new HashMap<>();
        map.put("test", false);
//        map = null;
//        Map<String, String> stringMap = Optional.ofNullable(map).orElse(new HashMap<>());
//        System.out.println(stringMap);
        Boolean aa = (Boolean) Optional.ofNullable(map.get("aa")).orElse(true);
        System.out.println("aa = " + aa);
//
//        Map<String, Map<String, String>> nestedMap = new HashMap<>();
//        nestedMap.put("outerKey", new HashMap<>());
//        nestedMap.get("outerKey").put("innerKey", "innerValue");
//
//        // 获取嵌套 Map 中的值
//        Optional.ofNullable(nestedMap.get("outerKey"))
//                .flatMap(map -> Optional.ofNullable(map.get("innerKey")))
//                .ifPresent(
//                        value -> System.out.println("Value found: " + value),
//                        () -> System.out.println("Value not found.")
//                )

    }
}
