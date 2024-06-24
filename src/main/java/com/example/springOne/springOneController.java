package com.example.springOne;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springOneController {

    @GetMapping("/one")
    public String getdata(){

        return "get data successfully";
    }
}
