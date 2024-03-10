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
        List<Blog> blogList = getBlog();
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

    public static List<Blog> getBlog() {
        List<Blog> blogs = new ArrayList<>();
        blogs.add(new Blog(1, "Java基础知识", "发布", "编程语言", "Java,基础"));
        blogs.add(new Blog(2, "Python科学计算", "草稿", "数据分析", "Python,科学计算"));
        blogs.add(new Blog(3, "流行的前端框架", "发布", "前端开发", "JavaScript,前端"));
        blogs.add(new Blog(4, "机器学习简介", "发布", "人工智能", "机器学习,AI"));
        blogs.add(new Blog(5, "数据库性能优化技巧", "发布", "数据库", "数据库,性能优化"));
        return blogs;
    }
}
