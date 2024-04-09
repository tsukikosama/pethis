package com.example.pethis.controller;

import com.example.pethis.common.Result;
import com.example.pethis.entity.Animal;
import com.example.pethis.service.AnimalService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animal")
@RequiredArgsConstructor
public class AnimalController {

    @Autowired
    private  AnimalService  animalService;

    @GetMapping("/list")
    @ApiOperation(value = "查询全部")
    public Result getAll(){
        return Result.ok(animalService.list());
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加")
    public Result add(@RequestBody Animal animal){
        return Result.ok(animalService.saveOrUpdate(animal));
    }

    @PostMapping("/remove")
    @ApiOperation(value = "根据id删除")
    public Result remove(@RequestParam("id") Integer id){
        return Result.ok(animalService.removeById(id));
    }

    @GetMapping("/{curr}")
    @ApiOperation(value = "分页查询")
    public Result toPage(@PathVariable("curr") Integer curr) {
        return Result.ok(animalService.listByPage(curr));
    }
}
