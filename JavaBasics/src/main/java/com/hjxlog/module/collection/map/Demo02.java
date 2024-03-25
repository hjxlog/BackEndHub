package com.hjxlog.module.collection.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo02 {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        Set<Long> aa = (Set<Long>) map.get("aa");
        aa.add(1L);
        System.out.println(aa);
    }

}
