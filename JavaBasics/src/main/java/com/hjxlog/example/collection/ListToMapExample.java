package com.hjxlog.example.collection;

import com.hjxlog.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapExample {

    public static void main(String[] args) {
        // 创建包含Person对象的List
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Alice"));
        personList.add(new Person(2, "Bob"));
        personList.add(new Person(3, "Charlie"));
        personList.add(new Person(1, "Elon"));
        // 将List转换为Map，以Person的ID为键，Person的NAME为值
//        Map<Integer, String> personMap = personList.stream()
//                .collect(Collectors.toMap(Person::getId, Person::getName));
        // 将List转换为Map，以Person的ID为键，Person的NAME为值
        Map<Integer, String> personMap = personList.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName, (existing, replacement) -> existing));
        // 打印转换后的Map
        personMap.forEach((id, person) -> System.out.println("ID: " + id + ", Person: " + person));
    }

}