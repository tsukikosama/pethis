package com.example.pethis.controller;

import com.example.pethis.common.Result;
import com.example.pethis.entity.Disease;
import com.example.pethis.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/disease")
public class DiseaseController {

    @Autowired
    private DiseaseService diseaseService;

    @GetMapping("/list")
    public Result getIllcase(){
        return Result.ok(diseaseService.list());
    }

    @PostMapping("/add")
    public Result addDisease(@RequestBody Disease disease){

        return Result.ok(diseaseService.saveOrUpdate(disease));
    }
    @PostMapping("/remove")
    public Result removeDisease(@RequestParam("id")Integer id){
        return Result.ok(diseaseService.removeById(id));
    }

    @GetMapping("/{curr}")
    public Result toPage(@PathVariable("curr") Integer curr){
        return Result.ok(diseaseService.listByPage(curr));
    }
}
