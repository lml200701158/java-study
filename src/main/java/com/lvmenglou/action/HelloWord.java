package com.lvmenglou.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "My first test!";
    }
}
