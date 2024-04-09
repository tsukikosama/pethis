package com.example.pethis.controller;

import com.example.pethis.common.Result;
import com.example.pethis.entity.Illnews;
import com.example.pethis.service.IllnewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/illnews")
public class IllnewsController {
    @Autowired
    private IllnewsService illnewsService;

    @GetMapping("/{id}")
    public Result getIllnews(@PathVariable Integer id){
        List<Illnews> list = illnewsService.listById(id);

        return Result.ok(list);
    }

}
