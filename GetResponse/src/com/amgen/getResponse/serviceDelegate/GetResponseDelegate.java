package com.amgen.getResponse.serviceDelegate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amgen.getResponse.dao.UserDaoImpl;
import com.amgen.getResponse.entity.userProfileManagement.User;
import com.amgen.getResponse.service.BusinessService;
import com.amgen.getResponse.serviceLookup.ServiceLookup;
import com.amgen.getResponse.utility.UtilityService;

/**
 * Servlet implementation class GetResponseDelegate1
 */
@WebServlet(name="GetResponseDelegate",urlPatterns ={"/GetResponseDelegate"})
public class GetResponseDelegate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BusinessService serviceType;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetResponseDelegate() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public BusinessService getServiceType() {
		return serviceType;
	}

    
    public void setServiceType(BusinessService serviceType) {
		this.serviceType = serviceType;
	}
    public BusinessService serviceDelegate(String serviceType) /*throws ServiceException*/{
		ServiceLookup.getInstance().getService(serviceType).service();
		System.out.println("serviceType: "+serviceType);
		
		return this.getServiceType();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User user = new User();
		BusinessService bs = serviceDelegate(request.getParameter("serviceType"));
		
		user.setFirst_name(request.getParameter("First_Name"));
		user.setLast_name(request.getParameter("Last_Name"));
		user.setEmail(request.getParameter("EMAIL"));
		user.setUsername(request.getParameter("USERNAME"));
		user.setPassword(request.getParameter("PASSWORD"));
		user.setPhone(Long.parseLong(request.getParameter("PHONE")));
		UtilityService.addUser(user);
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
