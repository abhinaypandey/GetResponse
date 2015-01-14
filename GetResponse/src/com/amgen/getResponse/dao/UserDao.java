package com.amgen.getResponse.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.amgen.getResponse.entity.userProfileManagement.User;

public interface UserDao {
	public User addUser(User user) throws FileNotFoundException, IOException ;
	
}


