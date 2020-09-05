package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuhang
 * @date 2020/9/3 16:46
 */
@Controller
public class HtmlController {
    @RequestMapping("/html")
    public String html(){
        return "index1";
    }
}
