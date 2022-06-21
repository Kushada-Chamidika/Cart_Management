package com.lk.codefest.day04.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lk.codefest.day04.dto.UserNameListObj;
import com.lk.codefest.day04.entities.user;
import com.lk.codefest.day04.services.userService;

@RestController
@RequestMapping(path = "/users")
public class userController {
	
	@Autowired
	userService userServ;

	@GetMapping(path = "/getallusers")
	public List<user> getAllUsers() {
		return userServ.getAllUsers();
	}
	
	@GetMapping(path = "/getuserbynameandage/{name}/{age}")
	public List<user> getUserByNameANdAge(@PathVariable String name,@PathVariable int age) {
		return userServ.getUserByNameANdAge(name, age);
	}
	
	@GetMapping(path = "/getuseragebetween/{start}/{end}")
	public List<user> getUserByAgeBetwwen(@PathVariable int start,@PathVariable int end) {
		return userServ.getUSerByAgeBetween(start, end);
	}
	
	@GetMapping(path = "/getuserbynamelike/{name}")
	public List<user> getUSerByNameLike(@PathVariable String name) {
		return userServ.getUSerByNameLike(name);
	}
	
	@GetMapping(path = "/getuserbyname/{name}")
	public List<UserNameListObj> getUSerByName(@PathVariable String name) {
		return userServ.getUSerByName(name);
	}
	
	@GetMapping(path = "/getuserbynamewithgender/{name}")
	public List<UserNameListObj> getUSerByNameWithGender(@PathVariable String name) {
		return userServ.getUserByNameWithGender(name);
	}
	
	@GetMapping(path = "/getdata")
	public List<String> getData() {
		return userServ.getUserNames();
	}
	
	@GetMapping(path = "/getdatabyusername/{username}")
	public List<user> getDataByUsername(@PathVariable String username) {
		return userServ.getDataByUsername(username);
	}
	
}
