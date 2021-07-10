package com.lvmenglou.action;

import com.lvmenglou.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller("personAction")
public class PersonAction {
    @Resource(name = "personService")
    private PersonService personService;
    public PersonService getPersonService() {
        return personService;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add() {
        personService.add(); // 调用personService中的add()方法
        System.out.println("Action层的add()方法执行了...");
        return "Call add!";
    }
}