package com.example.pethis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pethis.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DoctorMapper extends BaseMapper<Doctor> {
    @Select("select * from doctor limit ${(curr-1)*10},10")
    List<Doctor> listByPage(Integer curr);
    @Select("select * from doctor limit 0,6")
    List<Doctor> getHot();

    @Select("select * from doctor where username = #{username}")
    Doctor getDoctor(String username);
}
