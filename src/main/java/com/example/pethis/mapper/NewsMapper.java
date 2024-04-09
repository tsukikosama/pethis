package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.Disease;
import com.example.pethis.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper extends BaseMapper<News> {
    @Select("select * from news limit ${(curr-1)*10} ,10")
    List<News> listByPage(Integer current);
}
