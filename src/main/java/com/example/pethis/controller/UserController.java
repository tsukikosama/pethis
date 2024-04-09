package com.example.pethis.controller;

import com.example.pethis.common.Result;
import com.example.pethis.entity.User;
import com.example.pethis.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "登录")
    @PostMapping("/getone")
    public Result login(@RequestBody User user){
        return Result.ok(userService.login(user));
    }



    @ApiOperation(value = "查询用户")
    @GetMapping("/list")
    public Result all(){
        return Result.ok(userService.list());
    }

    @ApiOperation(value = "添加")
    @PostMapping("/save")
    public Result reg(@RequestBody User user){
        return Result.ok(userService.saveOrUpdate(user));
    }

    @ApiOperation("分页查询帖子")
    @RequestMapping("/list/{page}")
    public Result getAll(@PathVariable(value = "page",required = false)Integer page){

        return Result.ok(userService.listByPage(page));
    }

    @ApiOperation("根据id删除用户")
    @PostMapping("/remove")
    public Result removeNews(@RequestParam("id")Integer id){
        return Result.ok(userService.removeById(id));
    }
}
