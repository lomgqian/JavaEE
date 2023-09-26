package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import annotation.controller.AppleController;


public class AppleTest {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
		AppleController atcon = (AppleController)appCon.getBean("appleController"); 
		atcon.printApple();
	}

}
