package com.hjxlog.module.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

    public static void main(String[] args) {
        // 假设你的数据结构
        List<HashMap<String, String>> listOfMaps = new ArrayList<>();

        // 添加一些示例数据
        listOfMaps.add(createHashMap("Group1", "Label1", "Value1"));
        listOfMaps.add(createHashMap("Group1", "Label2", "Value2"));
        listOfMaps.add(createHashMap("Group2", "Label1", "Value3"));
        listOfMaps.add(createHashMap("Group2", "Label2", "Value4"));

        // 使用 Streams 进行分组并获取label数据
        Map<String, List<String>> groupedData = listOfMaps.stream()
                .collect(Collectors.groupingBy(
                        map -> map.get("groupname"),
                        Collectors.mapping(map -> map.get("label"), Collectors.toList())
                ));

        // 输出分组后的数据
        groupedData.forEach((groupname, labels) -> {
            System.out.println("Group: " + groupname);
            System.out.println("  Labels: " + labels);
        });
    }

    private static HashMap<String, String> createHashMap(String groupname, String label, String value) {
        HashMap<String, String> map = new HashMap<>();
        map.put("groupname", groupname);
        map.put("label", label);
        map.put("value", value);
        return map;
    }
}
