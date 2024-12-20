package com.domorecode.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.domorecode.Dao.UserDaoInterface;


@Component
public class UserService {
@Value("${userService.valueAnnotation}")
	private String valueAnnotation;

	private  UserDaoInterface userDao;


	public UserService(UserDaoInterface userDao) {
	
	System.out.println("constructor injection");
	this.userDao = userDao;
}
	
//	@Autowired
//private final UserDao userDao;//cant make final

	//@Autowired
//	public void setUserDao(UserDao userDao) {
//System.out.println("setter injection");
//		this.userDao=userDao;
//		
//	}
//
//	public UserService() {
//System.out.println("default constructor");
//	
//}

	public String printNameById(Integer id) {
		 System.out.println(valueAnnotation);//@Value
		String userName=userDao.getNameById(id);
//		System.out.println(userName);
		return userName;
	}
}
