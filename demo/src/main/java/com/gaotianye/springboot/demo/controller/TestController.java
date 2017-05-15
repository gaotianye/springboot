package com.gaotianye.springboot.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gaotianye.springboot.demo.properties.PersonProperties;
import com.gaotianye.springboot.demo.repository.Person;
import com.gaotianye.springboot.demo.repository.PersonRepository;

@RestController
@RequestMapping("/testController")
public class TestController {
	@Resource
	private PersonProperties person;
	@Resource
	private PersonRepository repository;
	
	@RequestMapping(value = "/test1",method = RequestMethod.GET)
	public String test1(){
		String username = person.getUsername();
		String password = person.getPassword();
		int age = person.getAge();
		String address = person.getAddress();
		return "username : "+username+",password : "+password+",age : "+age+",address : "+address;
	}
	
	@GetMapping(value="/getAll")
	public List<Person> getList(){
		return repository.findAll();
	}
}
