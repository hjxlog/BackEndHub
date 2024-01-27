package com.hjxlog.example.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SimplifiedGroupingExample {

    public static void main(String[] args) {
        // 假设你的数据结构
        List<ArrayList<HashMap<String, String>>> listOfLists = new ArrayList<>();

        // 添加一些示例数据
        ArrayList<HashMap<String, String>> group1 = new ArrayList<>();
        group1.add(createHashMap("Group1", "Label1", "Value1"));
        group1.add(createHashMap("Group1", "Label2", "Value2"));

        ArrayList<HashMap<String, String>> group2 = new ArrayList<>();
        group2.add(createHashMap("Group2", "Label1", "Value3"));
        group2.add(createHashMap("Group2", "Label2", "Value4"));

        listOfLists.add(group1);
        listOfLists.add(group2);

        // 使用 Streams 进行分组
        Map<String, List<String>> groupedData = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(
                        map -> map.get("groupName"),
                        Collectors.mapping(map -> map.get("labelValueName"), Collectors.toList())
                ));

        // 输出分组后的数据
        groupedData.forEach((groupName, labelValueNames) -> {
            System.out.println("Group: " + groupName);
            System.out.println("  LabelValueNames: " + labelValueNames);
        });
    }

    private static HashMap<String, String> createHashMap(String groupName, String labelValueName, String value) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupName", groupName);
        map.put("labelValueName", labelValueName);
        map.put("value", value);
        return map;
    }
}
