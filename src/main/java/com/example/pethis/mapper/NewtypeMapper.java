package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.Newtype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewtypeMapper extends BaseMapper<Newtype> {
    @Select("select * from user limit ${curr*10},10;")
    List<Newtype> listByPage(Integer curr);
}
