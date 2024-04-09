package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.News;
import com.example.pethis.entity.User;
import com.example.pethis.mapper.NewsMapper;
import com.example.pethis.mapper.UserMapper;
import com.example.pethis.service.NewsService;
import com.example.pethis.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pethis.utils.Common.MAX_SIZE;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User login(User user) {
        //通过用户名和密码查询用户
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper();
        wrapper.eq(User::getUsername,user.getUsername());
        wrapper.eq(User::getPassword,user.getPassword());
        return this.getOne(wrapper);
    }

    @Override
    public Page<User> listByPage(Integer curr) {
        Page<User> page = new Page<>(curr,MAX_SIZE);

        List<User> list = this.baseMapper.listByPage(curr);

        page.setRecords(list);
        page.setTotal(this.count());
        return page;
    }
}
