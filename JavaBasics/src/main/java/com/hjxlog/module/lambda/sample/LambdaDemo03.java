package com.hjxlog.module.lambda.sample;

import com.hjxlog.domain.Blog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo03 {
    public static void main(String[] args) {
        // filter
        List<String> list = Arrays.asList("莎士比亚", "李白", "弗朗茨·卡夫卡");
        // 过滤打印出名字超过3个字的
        list.stream()
                .filter(p -> p.length() > 2)
                .forEach(System.out::println);

        // map
        List<Blog> blogList = SampleData.getBlog();
        blogList.stream()
                .map(blog -> blog.getTitle())
                .forEach(System.out::println);

        blogList.stream()
                .map(blog -> "标题：" + blog.getTitle())
                .forEach(System.out::println);

        blogList.stream()
                .map(blog -> blog.getStatus())
                .distinct()
                .forEach(System.out::println);
    }

}
