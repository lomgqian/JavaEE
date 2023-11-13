package com.service;
import java.util.List;
import com.po.MyApple;
public interface UserService {
	public List<MyApple> selectUserByUname(MyApple apple);
}
