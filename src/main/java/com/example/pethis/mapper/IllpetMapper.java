package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.Illpet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IllpetMapper extends BaseMapper<Illpet> {
    @Select("select * from illpet limit ${curr*10},10;")
    List<Illpet> listByPage(Integer curr);

    @Select("select * from illpet where phone = ${key}")
    List<Illpet> listByPhone(String key);
}
