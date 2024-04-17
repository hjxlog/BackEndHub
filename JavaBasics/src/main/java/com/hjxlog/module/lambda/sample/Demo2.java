package com.hjxlog.module.lambda.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo2 {

    public static void main(String[] args) {
        // 初始化Map，用于存储各个ID列表
        Map<String, List<Long>> archiveIdMap = new HashMap<>();

        // 初始化各个ID列表
        List<Long> invalidIds = new ArrayList<>(); // 无效的id
        List<Long> createArchiveIds = new ArrayList<>(); // 创建档案的id
        List<Long> updateArchiveIds = new ArrayList<>(); // 更新档案的id
        List<Long> expireArchiveIds = new ArrayList<>(); // 失效档案的id

        // TODO: 根据实际业务逻辑添加ID到这些列表中
        // 例如：
        // invalidIds.add(1001L);
        // createArchiveIds.add(1002L);
        // updateArchiveIds.add(1003L);
        // expireArchiveIds.add(1004L);

        // 将列表添加到Map中对应的key
        archiveIdMap.put("invalidIds", invalidIds);
        archiveIdMap.put("createIds", createArchiveIds);
        archiveIdMap.put("updateIds", updateArchiveIds);
        archiveIdMap.put("expireIds", expireArchiveIds);

        System.out.println("archiveIdMap = " + archiveIdMap);
    }

}
