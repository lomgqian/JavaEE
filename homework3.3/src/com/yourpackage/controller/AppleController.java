package com.yourpackage.controller;

import com.yourpackage.domain.Apple;
import com.yourpackage.service.AppleServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppleController {
    private AppleServiceImpl appleService;

    public AppleController(AppleServiceImpl appleService) {
        this.appleService = appleService;
    }

    @RequestMapping("/printApple")
    public ModelAndView printApple() {
        Apple apple = appleService.getApple();
        ModelAndView modelAndView = new ModelAndView("appleView");
        modelAndView.addObject("apple", apple);
        return modelAndView;
    }
}
