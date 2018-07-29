package com.lovevol.mysite.controller.other;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/other/")
public class OtherController {

    @RequestMapping("/error")
    public String errorTest(){
        int a = 1 / 0;
        return "error";
    }

    @RequestMapping("/include")
    public String includePage(){
        return "/default/include";
    }
}
