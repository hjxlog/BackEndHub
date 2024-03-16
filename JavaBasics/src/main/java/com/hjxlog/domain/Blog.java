package com.hjxlog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Huang JX
 * @date: 2024/2/4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    private Long id;

    private String title;

    private String content;

    private Category category;

    private List<Tag> tagList;

}
