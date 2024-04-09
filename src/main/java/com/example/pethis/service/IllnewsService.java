package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Illnews;

import java.util.List;


public interface IllnewsService extends IService<Illnews> {
    List<Illnews> listByAnimal(String animal);

    List<Illnews> listById(Integer id);
}
