package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Animal;
import com.example.pethis.mapper.AnimalMapper;
import com.example.pethis.service.AnimalService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pethis.utils.Common.MAX_SIZE;

@Service
public class AnimalServiceImpl extends ServiceImpl<AnimalMapper, Animal>
        implements AnimalService {
    @Override
    public Page<Animal> listByPage(Integer curr) {
         Page<Animal> page = new Page<>(curr,MAX_SIZE);

        List<Animal> list = this.baseMapper.listByPage(curr);
        page.setRecords(list);
        page.setTotal(this.count());
        return page;
    }
}
