package com.domorecode.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements UserDaoInterface {
public String getNameById(Integer id) {
	if (id==100) {
		return"john";
	} else if (id==100) {
		return"ron";
	}else {
		return"invalid id";
	}
	
	
}
}
