package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Pettype;

public interface PettypeService extends IService<Pettype> {
    Page<Pettype> listByPage(Integer curr);

}
