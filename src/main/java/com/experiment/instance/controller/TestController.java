package com.experiment.instance.controller;

import com.experiment.instance.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author hanwen.dong
 * @date 2019/4/13 09:17
 * @Description auto
 */

@RestController
public class TestController extends BaseController{

    @Value("${spring.application.name}")
    private String serverName;

    static Integer cx=0;
    @GetMapping(value = "/test")
    public String test(){
        cx++;
        System.out.println("次数："+cx+" into hello world");
        System.out.println(serverName);
        return cx+"次hello world";
    }

    @PostMapping(value = "/testPost")
    public String postTest(@RequestBody Bean name){
        System.out.println(name.getBeanName());
        return name.getBeanName()+"hello world";
    }
}
