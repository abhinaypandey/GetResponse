package com.amgen.getResponse.dao;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.persistence.EntityManager;
import com.amgen.getResponse.entity.userProfileManagement.User;
import com.amgen.getResponse.utility.EntityManagerService;
public class UserDaoImpl implements UserDao{
	public User addUser(User user) throws FileNotFoundException, IOException{
			EntityManager em = EntityManagerService.getEntityManager();
			{
				
			try{
				 em.getTransaction().begin();
				 em.joinTransaction();
			     em.persist(user);
			     em.getTransaction().commit();
			     
			   } finally {
			    em.close();
			    
			   }
}
			return user;
			}
}
			
	