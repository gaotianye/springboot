package com.gaotianye.springboot.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaotianye.springboot.demo.properties.PersonProperties;

@RestController
@RequestMapping("/testController")
public class TestController {
	@Resource
	private PersonProperties person;
	
	@RequestMapping(value = "/test1",method = RequestMethod.GET)
	public String test1(){
		String username = person.getUsername();
		String password = person.getPassword();
		int age = person.getAge();
		String address = person.getAddress();
		return "username : "+username+",password : "+password+",age : "+age+",address : "+address;
	}
}
