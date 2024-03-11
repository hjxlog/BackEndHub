package com.hjxlog.module.lambda.sample;

import com.hjxlog.domain.Blog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaDemo04 {

    public static void main(String[] args) {
        List<Blog> blogs = SampleData.getBlog();
//        blogs.stream()
//                .sorted()
//                .forEach(System.out::println);

//        blogs.stream()
//                .sorted(new Comparator<Blog>() {
//                    @Override
//                    public int compare(Blog o1, Blog o2) {
//                        return o1.getViews() - o2.getViews();
//                    }
//                }).forEach(System.out::println);
//
//        blogs.stream()
//                .sorted((o1, o2) -> o1.getViews() - o2.getViews())
//                .forEach(System.out::println);

//        blogs.stream()
//                .limit(2)
//                .forEach(System.out::println);

//        blogs.stream()
//                .skip(2)
//                .forEach(System.out::println);

//        blogs.stream()
//                .skip(2)
//                .limit(2)
//                .forEach(System.out::println);

//
//        List<List<String>> data = Arrays.asList(
//                Arrays.asList("Java", "基础"),
//                Arrays.asList("Python", "科学计算"),
//                Arrays.asList("JavaScript", "前端")
//        );
//        data.stream()
//                .flatMap(new Function<List<String>, Stream<?>>() {
//                    @Override
//                    public Stream<?> apply(List<String> strings) {
//                        return strings.stream();
//                    }
//                }).forEach(System.out::println);


//        blogs.stream()
//                .forEach(blog -> blog.getTitle());

        long count = blogs.stream()
                .map(blog -> blog.getCategory())
                .count();
        System.out.println(count);

    }

}
