package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Illnews {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String illtype;
    private String title;
    private String subtitle;
    private String content;
    private String createtime;
    private String type;
}
