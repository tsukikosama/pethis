package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Newtype;
import com.example.pethis.entity.Pettype;
import com.example.pethis.entity.User;
import com.example.pethis.mapper.NewtypeMapper;
import com.example.pethis.mapper.UserMapper;
import com.example.pethis.service.NewtypeService;
import com.example.pethis.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pethis.utils.Common.MAX_SIZE;

@Service
public class NewtpyeServiceImpl extends ServiceImpl<NewtypeMapper, Newtype> implements NewtypeService {
    @Override
    public Page<Newtype> listByPage(Integer curr) {
        Page<Newtype> page = new Page<>(curr,MAX_SIZE);

        List<Newtype> list = this.baseMapper.listByPage(curr);

        page.setRecords(list);
        page.setTotal(this.count());
        return page;
    }
}
