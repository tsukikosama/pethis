package com.example.pethis.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pethis.entity.User;

public interface UserService extends IService<User> {
    User login(User user);

    Page<User> listByPage(Integer page);
}
