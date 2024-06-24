package com.example.springOne.controller;

import com.example.springOne.entity.springOneEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springOneController {

    @GetMapping("/one")
    public String getdata(){

        return "get data successfully";
    }
    @GetMapping("/getdata")
    public springOneEntity getData(){

        springOneEntity springoneentity=new springOneEntity(1,"tarun",27);

        return springoneentity;
    }
}
