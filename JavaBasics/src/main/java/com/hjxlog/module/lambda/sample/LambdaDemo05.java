package com.hjxlog.module.lambda.sample;

import com.hjxlog.domain.Blog;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo05 {

    public static void main(String[] args) {
        List<Blog> blogs = SampleData.getBlog();
        Integer max = blogs.stream()
                .map(blog -> blog.getViews())
                .max((o1, o2) -> o1 - o2).get();
        System.out.println(max);

        Integer min = blogs.stream()
                .map(blog -> blog.getViews())
                .min((o1, o2) -> o1 - o2).get();
        System.out.println(min);

    }

}
