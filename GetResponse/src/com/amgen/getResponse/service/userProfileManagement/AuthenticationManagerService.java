/**
 *
 * This comment is NOT a class level javadoc comment. 
 * 
 * @description: 
 * @author: singhda
 * @version: 
 *
 */
package com.amgen.getResponse.service.userProfileManagement;

public interface AuthenticationManagerService {
	
	//public String authenticateUser(String userName, String password) ;

	public boolean checkUser(String userName, String password);
	

}
