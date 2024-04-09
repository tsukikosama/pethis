package com.example.pethis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Illpet {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String petname;
    private String email;
    private String phone;
    private Integer state;
    private String illname;
}
