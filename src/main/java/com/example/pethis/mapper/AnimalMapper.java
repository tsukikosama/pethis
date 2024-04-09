package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.Animal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AnimalMapper extends BaseMapper<Animal> {
    @Select("select * from animal limit ${(curr-1)*10},10")
    List<Animal> listByPage(Integer curr);
}
