package com.example.pethis.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.example.pethis.common.Result;
import com.example.pethis.entity.Doctor;
import com.example.pethis.entity.User;
import com.example.pethis.service.DoctorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/all")
    public Result getDoctor(){
        List<Doctor> list = doctorService.list();
        for(Doctor item : list){

            item.setTitles(CollectionUtil.toList(item.getTitle().split(",")));
        }
        return Result.ok(list);
    }
    @ApiOperation(value = "注册")
    @PostMapping("/save")
    public Result reg(@RequestBody Doctor doctor){
        return Result.ok(doctorService.saveOrUpdate(doctor));
    }
    
    @ApiOperation(value = "删除医生")
    @PostMapping("/remove")
    public Result removeDoctor(@RequestParam("id")Integer id){
        return Result.ok(doctorService.removeById(id));
    }

    @ApiOperation(value = "分页查询")
    @GetMapping("/list/{curr}")
    public Result toPage(@PathVariable("curr") Integer curr){
        return Result.ok(doctorService.listByPage(curr));
    }

    @ApiOperation(value = "查询热门医生")
    @GetMapping("/hot")
    public Result getHot(){
        return Result.ok(doctorService.getHot());
    }

    @ApiOperation(value = "登录")
    @PostMapping("/login")
    public Result login(@RequestBody Doctor doctor){
        return Result.ok(doctorService.login(doctor));
    }
}
