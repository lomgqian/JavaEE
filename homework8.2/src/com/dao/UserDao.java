package com.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.po.MyApple;
@Repository("userDao")
@Mapper
public interface UserDao {
	public MyApple selectUserById(Integer uid);
	public List<MyApple> selectAllUser();
	public int addUser(MyApple apple);
	public int updateUser(MyApple apple);
	public int deleteUser(Integer uid);
}
