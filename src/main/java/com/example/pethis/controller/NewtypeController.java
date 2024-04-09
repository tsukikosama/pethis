package com.example.pethis.controller;

import com.example.pethis.common.Result;
import com.example.pethis.service.NewtypeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/newtype")
@AllArgsConstructor
public class NewtypeController {
    private NewtypeService newtypeService;
    @GetMapping("/list")
    public Result getList(){
        return Result.ok(newtypeService.list());
    }



}
