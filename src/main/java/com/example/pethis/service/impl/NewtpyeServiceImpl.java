package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Newtype;
import com.example.pethis.entity.User;
import com.example.pethis.mapper.NewtypeMapper;
import com.example.pethis.mapper.UserMapper;
import com.example.pethis.service.NewtypeService;
import com.example.pethis.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class NewtpyeServiceImpl extends ServiceImpl<NewtypeMapper, Newtype> implements NewtypeService {
}
