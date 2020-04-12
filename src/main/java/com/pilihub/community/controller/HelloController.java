package com.pilihub.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Version 1.0
 * @Author:redhujiao
 * @Date:2020/4/12 Content:
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public  String hello (@RequestParam(name= "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }

}
