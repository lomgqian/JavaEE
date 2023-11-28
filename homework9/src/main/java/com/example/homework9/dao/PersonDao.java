package com.example.homework9.dao;
import com.example.homework9.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface PersonDao {
	public Person selectPersonById1(Integer id);


}
