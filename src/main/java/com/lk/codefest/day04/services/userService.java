package com.lk.codefest.day04.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.codefest.day04.dto.UserNameListObj;
import com.lk.codefest.day04.entities.user;
import com.lk.codefest.day04.repository.userRepository;

@Service
public class userService {
	
	@Autowired
	userRepository userRepo;
	
	public List<user> getAllUsers() {
		return userRepo.findAll();
	}
	
	public List<user> getUserByNameANdAge(String name,int age) {
		return userRepo.findUserByNameAndAge(name, age);
	}
	
	public List<user> getUSerByAgeBetween(int startAge,int endAge) {
		return userRepo.getUserByAgeBetween(startAge, endAge);
	}
	
	public List<user> getUSerByNameLike(String name) {
		return userRepo.getUserByNameLike(name);
	}
	
	public List<UserNameListObj> getUSerByName(String name) {
		return userRepo.getUserByName(name);
	}
	
	public List<UserNameListObj> getUserByNameWithGender(String name) {
		return userRepo.getUserByNameWithGender(name);
	}
	
	public List<String> getUserNames() {
		return userRepo.getData();
	}
	
	public List<user> getDataByUsername(String username) {
		return userRepo.getDataByUsername(username);
	}

}
