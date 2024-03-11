package com.hjxlog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Blog implements Comparable<Blog> {

    private Integer id;

    private String title;

    private String status;

    private String category;

    private String tags;

    private Integer views;

    @Override
    public int compareTo(Blog blog) {
        return this.getViews() - blog.getViews();
    }
}