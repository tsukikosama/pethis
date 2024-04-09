package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Pettype;
import com.example.pethis.entity.User;
import com.example.pethis.mapper.PettypeMapper;
import com.example.pethis.mapper.UserMapper;
import com.example.pethis.service.PettypeService;
import com.example.pethis.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class PettypeServiceImpl extends ServiceImpl<PettypeMapper, Pettype> implements PettypeService {

}
