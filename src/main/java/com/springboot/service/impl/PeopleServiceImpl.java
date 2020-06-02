package com.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bean.People;
import com.springboot.mapper.PeopleMapper;
import com.springboot.service.PeopleService;
@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private PeopleMapper peopleMapper;
	public int insertPerson(People people) {
		// TODO Auto-generated method stub
		return peopleMapper.insert(people);
	}

	public static void main(String[] args) {
		System.getProperties().list(System.out);
	}
}
