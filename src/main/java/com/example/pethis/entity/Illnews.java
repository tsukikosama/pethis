package com.example.pethis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Illnews {
    private Integer id;
    private String illtype;
    private String title;
    private String subtitle;
    private String content;
    private String createtime;
    private String type;
}
