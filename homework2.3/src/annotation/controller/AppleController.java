package annotation.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import annotation.service.AppleServiceImpl;
@Controller("appleController")
public class AppleController {
	@Autowired
	private AppleServiceImpl appleService;
	public void printApple() {
		System.out.println(appleService.getApples());
	}

}
