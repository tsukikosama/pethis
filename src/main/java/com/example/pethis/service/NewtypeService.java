package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Newtype;

public interface NewtypeService extends IService<Newtype> {
    Page<Newtype> listByPage(Integer curr);
}
