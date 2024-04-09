package com.example.pethis.controller;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.pethis.common.Result;
import com.example.pethis.entity.News;
import com.example.pethis.service.NewsService;
import com.example.pethis.service.NewtypeService;
import com.example.pethis.service.impl.NewsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsServiceImpl newsService;


    @GetMapping("/list")
    public Result getnews(){
        List<News> list = newsService.list();
        newsService.toNews(list);
        return Result.ok(list);
    }
    @GetMapping("/type")
    public Result getNewsByType(@RequestParam("type")Integer type){
        List<News> list = newsService.listByType(type);
        return Result.ok(list);
    }
    @PostMapping("/add")
    public Result addNews(@RequestBody News news){
        System.out.println(news);
        news.setCreatetime(DateUtil.now());
        return Result.ok(newsService.saveOrUpdate(news));
    }

    @GetMapping("/{current}")
    public Result toPage(@PathVariable("current")Integer current){
        Page<News> list =  newsService.listByPage(current);
        return Result.ok(list);
    }

    @PostMapping("/remove")
    public Result removeNews(@RequestParam("id")Integer id){
        return Result.ok(newsService.removeById(id));
    }
}
