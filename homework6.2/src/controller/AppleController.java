package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import entity.Apple;
import pojo.User;
@Controller
public class AppleController {
	@RequestMapping("/toLogin")
	public String initLogin() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(User user, Model model,HttpSession session) {
		System.out.println(user.getUname());
		if("yjj".equals(user.getUname()) &&
				 "123456".equals(user.getUpwd())) {
			session.setAttribute("user", user);
			//重定向到主页面的跳转方法
			return "redirect:main";
		}
		model.addAttribute("msg","用户名或密码错误，请重新登录！");
		return "login";
	}
	@RequestMapping("/main")
	public String toMain() {
		return "main";
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//清除session
		session.invalidate();
		return "login";
	}
	
	
	
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
