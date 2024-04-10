package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.News;
import com.example.pethis.entity.Pettype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface PettypeMapper extends BaseMapper<Pettype> {
    @Select("select * from user limit ${curr*10},10;")
    List<Pettype> listByPage(Integer curr);
}
