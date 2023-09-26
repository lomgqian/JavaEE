package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.AppleService;
@Controller("appleController")
public class AppleController {
	@Autowired
	private AppleService appleService;
	public void setAppleService(AppleService appleService) {
		this.appleService=appleService;
	}
	public void printApple() {
		System.out.println(appleService.getApples());
	}

}
