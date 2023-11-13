package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dao.UserDao;
import com.po.MyApple;
@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	@RequestMapping("/select")
	public String select(MyApple apple, Model model) {
		List<MyApple> list = userDao.selectUserByUname(apple);
		model.addAttribute("userList", list);
		return "userList";
	}
}
