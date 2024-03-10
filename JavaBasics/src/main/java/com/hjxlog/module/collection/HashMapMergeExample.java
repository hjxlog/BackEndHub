package com.hjxlog.module.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapMergeExample {

    public static void main(String[] args) {
        // 创建一个HashMap
        Map<String, Integer> wordCountMap = new HashMap<>();

        // 合并键值对，如果键不存在，则直接关联；如果键已存在，则使用合并函数进行合并
        wordCountMap.merge("apple", 1, Integer::sum);
        wordCountMap.merge("banana", 2, Integer::sum);
        wordCountMap.merge("apple", 1, Integer::sum);

        // 打印合并后的结果
        System.out.println("Word Count Map: " + wordCountMap);
    }

}