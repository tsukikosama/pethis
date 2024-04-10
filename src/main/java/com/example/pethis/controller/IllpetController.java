package com.example.pethis.controller;

import com.example.pethis.common.Result;
import com.example.pethis.entity.Illpet;
import com.example.pethis.service.IllpetService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/illpet")
public class IllpetController {

    @Autowired
    private IllpetService illpetService;

    @ApiOperation("查询全部生病的宠物")
    @GetMapping("/list")
    public Result getIllcase(){
        return Result.ok(illpetService.list());
    }

    @ApiOperation("分页查询")
    @GetMapping("/list/{curr}")
    public Result toPage(@PathVariable("curr") Integer curr){
        return Result.ok(illpetService.listByPage(curr));
    }

    @ApiOperation("保存或者修改病患信息")
    @PostMapping("/save")
    public Result saveIllpet(@RequestBody Illpet illpet){
        System.out.println(illpet);
        return Result.ok(illpetService.saveOrUpdate(illpet));
    }

    @ApiOperation("删除宠物信息")
    @PostMapping("/remove")
    public Result removeIllpet(@RequestParam("id")Integer id){

        return Result.ok(illpetService.removeById(id));
    }


}
