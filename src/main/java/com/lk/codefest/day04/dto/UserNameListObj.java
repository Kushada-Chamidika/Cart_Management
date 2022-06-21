package com.lk.codefest.day04.dto;

public class UserNameListObj {
	
	int idUser;
	String name;
	int age;
	String gender;
	
	public UserNameListObj() {
	}

	public UserNameListObj(int idUser, String name, int age) {
		this.idUser = idUser;
		this.name = name;
		this.age = age;
	}
	
	public UserNameListObj(int idUser, String name, int age, String gender) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
