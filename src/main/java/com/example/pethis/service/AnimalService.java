package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Animal;

public interface AnimalService extends IService<Animal> {
    Page<Animal> listByPage(Integer curr);
}
