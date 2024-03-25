package com.hjxlog.module.collection.list.sample01;

import java.util.ArrayList;
import java.util.List;

public class ClearListExample {
    public static void main(String[] args) {
        // 创建一个 List 并添加一些元素
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // 打印初始的 List
        System.out.println("Original List: " + myList);

        // 清空 List
        myList.clear();

        // 打印清空后的 List
        System.out.println("Cleared List: " + myList);
        System.out.println("myList.size() = " + myList.size());
    }
}