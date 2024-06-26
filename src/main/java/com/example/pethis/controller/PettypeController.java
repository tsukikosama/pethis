package com.example.pethis.controller;


import com.example.pethis.common.Result;
import com.example.pethis.entity.Pettype;
import com.example.pethis.service.PettypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pettype")
public class PettypeController {

    @Autowired
    private PettypeService pettypeService;

    @GetMapping("/list")
    public Result getAll(){
        return Result.ok(pettypeService.list());
    }

    @PostMapping("/save")
    public Result reg(@RequestBody Pettype pettype){
        return Result.ok(pettypeService.saveOrUpdate(pettype));
    }

    @GetMapping("/list/{curr}")
    public Result toPage(@PathVariable("curr") Integer curr){
        return Result.ok(pettypeService.listByPage(curr));
    }

    @PostMapping("/remove")
    public Result removePettype(@RequestParam("id")Integer id){
        return Result.ok(pettypeService.removeById(id));
    }
}
