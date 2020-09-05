package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhang
 * @date 2020/9/2 18:55
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public  String hello(String name){
         return name+",你好";
    }
}
