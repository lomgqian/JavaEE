package controller;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Users;
import service.UsersService;
@Controller
@RequestMapping("/users")
public class UsersController {
	private static final Log logger = LogFactory.getLog(UsersController.class);
	@Autowired
	private UsersService usersService;
	@RequestMapping("/register")
	public String input(Model model){
	
		model.addAttribute("users", new Users());
		return "register";
	}
	@RequestMapping("/tologin")
	public String save(@Valid @ModelAttribute Users users, BindingResult result, Model model){
		if(result.hasErrors()){
			return "register";
		} 
		usersService.save(users);
		logger.info("注册成功");
		model.addAttribute("msg", "注册成功！,请登录账号");  
		model.addAttribute("usersList", usersService.getUsers());
		return "login";
	}
	@RequestMapping("/login")
	public String login(@ModelAttribute Users users, BindingResult result, Model model,HttpSession session){
		if(!usersService.verify(users)){
			logger.info("用户名或密码错误，请重新登录！");
			model.addAttribute("msg", "用户名或密码错误，请重新登录！"); 
			return "login";
		}
		session.setAttribute("flag", 1);
		logger.info("登录成功");
		return "multiFiles";
	}
	@RequestMapping("/mult")
	public String mult(){
		return "multiFiles";
	}
}
