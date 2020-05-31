package com.springboot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.springboot.bean.People;

@Mapper
public interface PeopleMapper {

	@Insert("insert into  people(id,name) values (#{id},#{name})")
	int insert(People people);
}
