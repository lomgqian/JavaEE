package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.dao.UserDao;
import com.po.MyApple;
@Controller("userController")
public class UserController {
	@Autowired
	private UserDao userDao;
	public void test() {
		MyApple auser = userDao.selectUserById(1);
		System.out.println(auser);
		System.out.println("================");
		MyApple addmu = new MyApple();
		addmu.setUname("苹果1");
		addmu.setuprice("3.8");
		int add = userDao.addUser(addmu);
		System.out.println("添加了" + add + "条记录");
		System.out.println("================");
		MyApple updatemu = new MyApple();
		updatemu.setUid(1);
		updatemu.setUname("苹果2");
		updatemu.setuprice("3.9");
		int up = userDao.updateUser(updatemu);
		System.out.println("修改了" + up + "条记录");
		System.out.println( "================");
		int dl = userDao.deleteUser(9);
		System.out.println("删除了" + dl + "条记录");
		System.out.println("================");
		List<MyApple> list = userDao.selectAllUser();
		for (MyApple myApple : list) {
			System.out.println(myApple);
		}
	}
}
