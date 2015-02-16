package com.amgen.getResponse.utility;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.amgen.getResponse.dao.UserDao;
import com.amgen.getResponse.dao.UserDaoImpl;
import com.amgen.getResponse.entity.userProfileManagement.User;


public class UtilityService {
	public static boolean addUser(User user) throws FileNotFoundException, IOException {
	UserDao DAO = new UserDaoImpl();
			DAO.addUser(user);
		return false;	
		}	
		public static boolean checkUser(User user)
		{	
			
			return false;
			
		}
		
	


}
