package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.News;
import com.example.pethis.entity.Pettype;
import com.example.pethis.entity.User;
import com.example.pethis.mapper.PettypeMapper;
import com.example.pethis.mapper.UserMapper;
import com.example.pethis.service.PettypeService;
import com.example.pethis.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pethis.utils.Common.MAX_SIZE;

@Service
public class PettypeServiceImpl extends ServiceImpl<PettypeMapper, Pettype> implements PettypeService {

    @Override
    public Page<Pettype> listByPage(Integer curr) {
        Page<Pettype> page = new Page<>(curr,MAX_SIZE);

        List<Pettype> list = this.baseMapper.listByPage(curr);

        page.setRecords(list);
        page.setTotal(this.count());
        return page;
    }
}
