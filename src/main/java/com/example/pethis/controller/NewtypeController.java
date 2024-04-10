package com.example.pethis.controller;

import com.example.pethis.common.Result;
import com.example.pethis.entity.Newtype;
import com.example.pethis.entity.Pettype;
import com.example.pethis.service.NewtypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/newtype")
@AllArgsConstructor
public class NewtypeController {
    private NewtypeService newtypeService;
    @GetMapping("/list")
    public Result getList(){
        return Result.ok(newtypeService.list());
    }

    @PostMapping("/save")
    public Result reg(@RequestBody Newtype newtype){
        System.out.println(newtype);
        return Result.ok(newtypeService.saveOrUpdate(newtype));
    }

    @GetMapping("/list/{curr}")
    public Result toPage(@PathVariable("curr") Integer curr){
        return Result.ok(newtypeService.listByPage(curr));
    }

    @PostMapping("/remove")
    public Result removePettype(@RequestParam("id")Integer id){
        return Result.ok(newtypeService.removeById(id));
    }

}
