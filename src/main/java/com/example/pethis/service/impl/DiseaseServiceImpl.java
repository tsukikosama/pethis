package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Disease;
import com.example.pethis.entity.News;
import com.example.pethis.mapper.DiseaseMapper;
import com.example.pethis.service.DiseaseService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pethis.utils.Common.MAX_SIZE;

@Service
public class DiseaseServiceImpl extends ServiceImpl<DiseaseMapper, Disease>
        implements DiseaseService {
    @Override
    public Page<Disease> listByPage(Integer curr) {
        Page<Disease> page = new Page<>(curr,MAX_SIZE);

        List<Disease> list = this.baseMapper.listByPage(curr);

        page.setRecords(list);
        page.setTotal(this.count());
        return page;
    }
}
