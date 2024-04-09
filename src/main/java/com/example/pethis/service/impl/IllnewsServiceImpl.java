package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.pethis.entity.Illnews;


import com.example.pethis.mapper.IllnewsMapper;
import com.example.pethis.service.IllnewsService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IllnewsServiceImpl extends ServiceImpl<IllnewsMapper, Illnews> implements IllnewsService {


    @Override
    public List<Illnews> listByAnimal(String animal) {
        LambdaQueryWrapper<Illnews> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Illnews::getType,animal);
        wrapper.last("limit 3");
        return list(wrapper);
    }

    @Override
    public List<Illnews> listById(Integer id) {
        LambdaQueryWrapper<Illnews> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Illnews::getType,id);

        return list(wrapper);
    }
}
