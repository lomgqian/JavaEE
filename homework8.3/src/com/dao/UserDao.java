package com.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.po.MyApple;
@Repository("userDao")
@Mapper

public interface UserDao {

	public List<MyApple> selectUserByUname(MyApple apple);
}
