package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.Disease;

import java.util.List;

public interface DiseaseService extends IService<Disease> {
    Page<Disease> listByPage(Integer curr);
}
