package com.hjxlog.module.lambda.sample;

import com.hjxlog.domain.Blog;

import java.util.ArrayList;
import java.util.List;

public class SampleData {

    public static List<Blog> getBlog() {
        List<Blog> blogs = new ArrayList<>();
        blogs.add(new Blog(1, "Java基础知识", "发布", "编程语言", "Java,基础", 150));
        blogs.add(new Blog(2, "Python科学计算", "草稿", "数据分析", "Python,科学计算", 75));
        blogs.add(new Blog(3, "流行的前端框架", "发布", "前端开发", "JavaScript,前端", 200));
        blogs.add(new Blog(4, "机器学习简介", "发布", "人工智能", "机器学习,AI", 350));
        blogs.add(new Blog(5, "数据库性能优化技巧", "发布", "数据库", "数据库,性能优化", 120));
        return blogs;
    }

}
