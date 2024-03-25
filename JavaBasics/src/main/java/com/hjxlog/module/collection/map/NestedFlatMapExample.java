package com.hjxlog.module.collection.map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NestedFlatMapExample {

    public static void main(String[] args) {
        // 定义一个包含嵌套 Map 的列表
        List<Map<String, Object>> nestedLists = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("forbiddenEmployeeIdList", new HashSet<>(Arrays.asList(3, 22)));
        Map<String, Object> errorInfoMap1 = new HashMap<>();
        errorInfoMap1.put("system_error", new HashSet<>(Arrays.asList(12, 45)));
        errorInfoMap1.put("empposorgrel_is_null", new HashSet<>(Arrays.asList(1)));
        map1.put("errorInfoMap", errorInfoMap1);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("forbiddenEmployeeIdList", new HashSet<>(Arrays.asList(2, 3)));
        Map<String, Object> errorInfoMap2 = new HashMap<>();
        errorInfoMap2.put("system_error", new HashSet<>(Arrays.asList(4)));
        errorInfoMap2.put("empposorgrel_is_null", new HashSet<>(Arrays.asList(6, 8)));
        map2.put("errorInfoMap", errorInfoMap2);
        nestedLists.add(map1);
        nestedLists.add(map2);

        Set<Long> forbiddenEmployeeIdList = new HashSet<>();
        Map<String, Object> infoMapRlt = new HashMap<>();

        for (Map<String, Object> list : nestedLists) {
            Set<Long> forbiddenEmployeeIdList1 = (Set<Long>) list.get("forbiddenEmployeeIdList");
            forbiddenEmployeeIdList.addAll(forbiddenEmployeeIdList1);

            Map<String, Object> infoMap = (Map<String, Object>) list.get("errorInfoMap");
            for (Map.Entry<String, Object> entry : infoMap.entrySet()) {
                String key = entry.getKey();
                Set<Long> value = (Set<Long>) entry.getValue();
                if (infoMapRlt.containsKey(key)) {
                    Set<Long> values = (Set<Long>) infoMapRlt.get(key);
                    values.addAll(value);
                    infoMapRlt.put(key, values);
                } else {
                    infoMapRlt.put(key, value == null ? new HashSet<Long>() : value);
                }
            }
        }

        Map<String, Object> result = new HashMap<>();
        result.put("forbiddenEmployeeIdList", forbiddenEmployeeIdList);
        result.put("errorInfoMap", infoMapRlt);
        System.out.println(result);
    }
}