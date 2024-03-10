package com.hjxlog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Blog {

    private Integer id;

    private String title;

    private String status;

    private String category;

    private String tags;

}