package com.experiment.instance.controller;

import com.experiment.instance.Bean;
import org.springframework.web.bind.annotation.*;

/**
 * @author hanwen.dong
 * @date 2019/4/13 09:17
 * @Description auto
 */

@RestController
public class TestController extends BaseController{
    @GetMapping(value = "/test")
    public String test(){
        return "hello world";
    }

    @PostMapping(value = "/testPost")
    public String postTest(@RequestBody Bean name){
        System.out.println(name.getBeanName());
        return name.getBeanName()+"hello world";
    }
}
