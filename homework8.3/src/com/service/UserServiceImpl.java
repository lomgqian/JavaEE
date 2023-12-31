package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.UserDao;
import com.po.MyApple;
@Service("userService")
@Transactional

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public List<MyApple> selectUserByUname(MyApple apple) {
		return userDao.selectUserByUname(apple);
	}
}
