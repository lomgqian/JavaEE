package com.example.homework9.dao;
import com.example.homework9.pojo.Idcard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IdCardDao {
	public Idcard selectCodeById(Integer i);
}
