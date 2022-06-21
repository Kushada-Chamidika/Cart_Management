package com.lk.codefest.day04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lk.codefest.day04.dto.UserNameListObj;
import com.lk.codefest.day04.entities.user;

@Repository
public interface userRepository extends JpaRepository<user,Integer>{
	
	@Query("SELECT u FROM user u WHERE u.name=?1 AND u.age=?2")
	public List<user> findUserByNameAndAge(String name,int age);
	
	@Query("SELECT u FROM user u WHERE u.age BETWEEN ?1 AND ?2")
	public List<user> getUserByAgeBetween(int startAge,int EndAge);
		
	@Query("SELECT u FROM user u WHERE u.name LIKE %?1%")
	public List<user> getUserByNameLike(String key);
	
	@Query("SELECT new com.lk.codefest.day04.dto.UserNameListObj(u.id,u.name,u.age) FROM user u WHERE u.name=?1")
	public List<UserNameListObj> getUserByName(String key);
	
	@Query("SELECT new com.lk.codefest.day04.dto.UserNameListObj(u.id,u.name,u.age,g.value) FROM user u JOIN u.gender g WHERE u.name LIKE ?1%")
	public List<UserNameListObj> getUserByNameWithGender(String key);
	
	@Query(value = "SELECT name FROM user",nativeQuery = true)
	public List<String> getData();
	
	@Query(value = "SELECT * FROM user u WHERE u.username=?1",nativeQuery = true)
	public List<user> getDataByUsername(String uname);

}
