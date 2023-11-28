package com.example.homework9.controller;

import com.example.homework9.dao.PersonDao;
import com.example.homework9.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController("oneToOneController")
@Controller("oneToOneController")
public class OneToOneController {
    @Autowired
    private PersonDao personDao;

    @RequestMapping("/test1")
    @ResponseBody
    public Person test() {
        return personDao.selectPersonById1(1);
    }


    @RequestMapping("/test2")
    public String test2(Model model) {
        Person p1=personDao.selectPersonById1(1);
        model.addAttribute("person",p1);
        return "f1";

    }
}
