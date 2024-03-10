package com.hjxlog.module.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenArrayListExample {

    public static void main(String[] args) {
        // 假设你的数据结构
        List<ArrayList<HashMap<String, String>>> nestedList = new ArrayList<>();

        // 添加一些示例数据
        ArrayList<HashMap<String, String>> group1 = new ArrayList<>();
        group1.add(createHashMap("Group1", "Label1", "Value1"));
        group1.add(createHashMap("Group1", "Label2", "Value2"));

        ArrayList<HashMap<String, String>> group2 = new ArrayList<>();
        group2.add(createHashMap("Group2", "Label1", "Value3"));
        group2.add(createHashMap("Group2", "Label2", "Value4"));

        nestedList.add(group1);
        nestedList.add(group2);

        // 使用 Streams 进行打平
        List<HashMap<String, String>> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        // 输出打平后的数据
        flattenedList.forEach(System.out::println);
    }

    private static HashMap<String, String> createHashMap(String groupName, String labelValueName, String value) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupName", groupName);
        map.put("labelValueName", labelValueName);
        map.put("value", value);
        return map;
    }
}
