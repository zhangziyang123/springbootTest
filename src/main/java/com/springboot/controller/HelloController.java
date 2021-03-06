package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.People;
import com.springboot.bean.RechageResponse;
import com.springboot.service.PeopleService;

@RestController
@RequestMapping("/hello2")
public class HelloController {
	@Autowired
	private PeopleService peopleSevice;

	@RequestMapping("/a")
	public String a(){
		return "a";
	}
	
	@RequestMapping("/insertPerople")
	public String insertPeople(){
		People people = new People();
		people.setId(1);
		people.setName("张子阳");
		peopleSevice.insertPerson(people);
		return "a";
	}
	
	@RequestMapping("/test")
	public String test(@RequestBody RechageResponse rechageResponse){
		System.out.println(rechageResponse.getVoucherContent()+"&"+rechageResponse.getRequestId()+"&"+rechageResponse.getMethod()+"&"+rechageResponse.getResult());
		System.out.println("1111");
		return "{\"result\":0}";
	}
	
	

}
