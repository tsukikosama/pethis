package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Illpet;


public interface IllpetService extends IService<Illpet> {

    Page<Illpet> listByPage(Integer curr);
}
