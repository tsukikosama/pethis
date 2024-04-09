package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.entity.Disease;
import com.example.pethis.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DiseaseMapper extends BaseMapper<Disease> {
    @Select("select * from disease limit ${(curr-1)*10} ,10")
    List<Disease> listByPage(@Param("curr") Integer curr);

}
