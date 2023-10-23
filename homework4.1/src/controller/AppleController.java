package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import entity.Apple;

@Controller
public class AppleController {
    @RequestMapping("/appleRequest")
    public ModelAndView appleRequest() {
        ModelAndView mv = new ModelAndView("/applerequest");
        Apple apple1 = new Apple();

        apple1.setApplePrice(2.99f);
        apple1.setAppleName("红富士");
        mv.addObject("apple1", apple1);
        return mv;
    }

    @RequestMapping("/getApple")
    @ResponseBody
    public Apple getApple() {
        Apple apple = new Apple();

        apple.setApplePrice(2.99f);
        apple.setAppleName("Red Delicious");
        return apple;
    }

    @RequestMapping("/getApple2")
    @ResponseBody
    public ModelAndView getApple2() {
    	ModelAndView mv2 = new ModelAndView("/apple_dashboard");
        Apple apple = new Apple();
        apple.setApplePrice(2.99f); 
        apple.setAppleName("红富士");
        mv2.addObject("apple", apple);
        return mv2;
    }
}
