package com.example.pethis.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.pethis.entity.Illpet;

import com.example.pethis.entity.User;
import com.example.pethis.mapper.IllpetMapper;

import com.example.pethis.service.IllpetService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pethis.utils.Common.MAX_SIZE;


@Service
public class IllpetServiceImpl extends ServiceImpl<IllpetMapper, Illpet>
        implements IllpetService {
    @Override
    public Page<Illpet> listByPage(Integer curr) {
        Page<Illpet> page = new Page<>(curr,MAX_SIZE);

        List<Illpet> list = this.baseMapper.listByPage(curr);
        page.setRecords(list);
        page.setTotal(this.count());
        return page;

    }
}
