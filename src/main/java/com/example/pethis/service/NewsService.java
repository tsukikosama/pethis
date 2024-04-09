package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.News;

import java.util.List;

public interface NewsService extends IService<News> {
    List<News> listByType(Integer type);

    Page<News> listByPage(Integer current);
}
