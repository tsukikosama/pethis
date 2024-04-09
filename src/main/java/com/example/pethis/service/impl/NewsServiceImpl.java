package com.example.pethis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pethis.entity.Disease;
import com.example.pethis.entity.Illnews;
import com.example.pethis.entity.News;
import com.example.pethis.mapper.IllnewsMapper;
import com.example.pethis.mapper.NewsMapper;
import com.example.pethis.service.IllnewsService;
import com.example.pethis.service.NewsService;
import com.example.pethis.service.NewtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.pethis.utils.Common.MAX_SIZE;

@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

    @Autowired
    private NewtypeService newtypeService;
    @Override
    public List<News> listByType(Integer type) {
        LambdaQueryWrapper<News> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(News::getId,type);
        return list(wrapper);
    }

    @Override
    public Page<News> listByPage(Integer current) {
        Page<News> page = new Page<>(current,MAX_SIZE);

        List<News> list = this.baseMapper.listByPage(current);
        toNews(list);
        page.setRecords(list);
        page.setTotal(this.count());
        return page;
    }

    public void toNews(List<News> news){
        news.stream().forEach(item -> item.setNewtype(newtypeService.getById(item.getType()).getTypeName()));
    }
}
