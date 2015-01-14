package com.amgen.getResponse.service.admin;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.amgen.getResponse.entity.campaign.Channel;
import com.amgen.getResponse.entity.campaign.Product;
import com.amgen.getResponse.entity.userProfileManagement.User;
import com.amgen.getResponse.dao.*;
public  class AdminManagerServiceImpl implements AdminManagerService {
	private UserDao userDAO;
	@Override
	public void service(String action,User user) throws FileNotFoundException, IOException {

		// TODO Auto-generated method stub
		if (action.equalsIgnoreCase("add")) {
			System.out.println("user");
			userDAO.addUser(user);
		}

	}

	@Override
	public Integer addProducts(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addChannel(Channel channel) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void service() {
		// TODO Auto-generated method stub

	}



	@Override
	public void service(String str) {
		// TODO Auto-generated method stub

	}




	@Override
	public void service(String str, Object obj) {
		// TODO Auto-generated method stub

	}








}





