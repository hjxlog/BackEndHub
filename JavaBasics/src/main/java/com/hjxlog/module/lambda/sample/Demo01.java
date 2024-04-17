package com.hjxlog.module.lambda.sample;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Demo01 {

    public static void main(String[] args) {
        // 创建一个包含 Map 对象的 List
        List<Map<String, Object>> list = new ArrayList<>();
        // 添加 Map 对象到 List 中
        Map<String, Object> map1 = new HashMap<>();
        map1.put("startdate", LocalDateTime.of(2024, 4, 6, 12, 0, 0));
        map1.put("name", "张三");
        map1.put("endDate", LocalDateTime.of(2024, 4, 8, 18, 0, 0));
        Map<String, Object> map2 = new HashMap<>();
        map2.put("startdate", LocalDateTime.of(2024, 4, 5, 11, 30, 0));
        map2.put("name", "李四");
        map2.put("endDate", LocalDateTime.of(2024, 4, 7, 17, 30, 0));
        Map<String, Object> map3 = new HashMap<>();
        map3.put("startdate", LocalDateTime.of(2024, 4, 4, 10, 45, 0));
        map3.put("name", "王五");
        map3.put("endDate", LocalDateTime.of(2024, 4, 6, 16, 45, 0));
        Map<String, Object> map4 = new HashMap<>();
        map4.put("startdate", LocalDateTime.of(2024, 4, 4, 10, 45, 0));
        map4.put("name", "赵六");
        map4.put("endDate", LocalDateTime.of(2024, 4, 5, 15, 30, 0));
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);

        List<Map<String, Object>> collect = list.stream()
                .sorted(Comparator.comparing(p -> (LocalDateTime) ((Map<String, Object>) p).get("startdate"))
                        .thenComparing(q -> (LocalDateTime) ((Map<String, Object>) q).get("endDate"))
                        .reversed()).collect(Collectors.toList());


//        // 使用 Stream API 对 List 中的 Map 对象进行排序
//        List<Map<String, Object>> sortedList = list.stream()
//                // 使用 Comparator 比较器，根据 startdate 字段的值进行降序排序
//                .sorted(Comparator.comparing(Map::get("startdate")).reversed())
//        // 如果 startdate 相同，再根据 endDate 字段的值进行升序排序
//             .sorted(Comparator.comparing(Map::get("endDate")).thenComparing())
//             .collect(Collectors.toList());

        // 打印排序后的结果
        for (Map<String, Object> sortedMap : collect) {
            System.out.println(sortedMap);
        }
    }

}
