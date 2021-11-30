package com.zch.communtiy.communtiy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zch
 * @Date: 2021/11/30 22:04
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
