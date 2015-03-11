package com.amgen.getResponse.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import java.util.logging.Logger;

public class EntityManagerService {
	/**
	 * instance variables
	 */
	private static final String PERSISTENCE_UNIT_NAME = "User";
	private static EntityManagerFactory emFactory;
	/**
	 * method provides single entry access point for entityManager
	 * @return
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	//private static final String FILENAME="Resources/db";
	public static EntityManager getEntityManager() throws FileNotFoundException, IOException {
		
		GetResponseLog log = GetResponseLoggerFactory.getLog("GetResponseLog");
		//GetResponseLog log = GetResponseLoggerFactory.getLog("GetResponseLog");
		
		//if( log.isDebugEnabled() ){
		   log.debug("getEntityManager().. ");
		//}
		/*
		Properties props = new Properties();
		props.load(new FileInputStream("log4j.properties"));
		PropertyConfigurator.configure(props);
		 */
		// configures the root logger
		// Logger rootLogger = Logger.getAnonymousLogger();
		//rootLogger.setLevel(Level.DEBUG);
		// rootLogger.setLevel(Level.DEBUG);
		//((Logger) rootLogger).addAppender(rollingAppender);
		//Logger log = Logger.getLogger("MyLog");  
//Logger log=Logger.getLogger("MyLog");
		//GetResponseLog log = GetResponseLoggerFactory.getLog(GetResponseLog.class);
		FileHandler fh;  

		try {  

			// This block configure the logger with handler and formatter  
			//fh = new FileHandler("c:/Abhishek/workspace/Logs-GR/track"); 

			//log.addHandler(fh);
			//SimpleFormatter formatter = new SimpleFormatter();  
			//fh.setFormatter(formatter); 
		
			log.info("My first log");  
			log.info("hello all");
			log.info("hello alllll");
		} catch (SecurityException e) {  
			e.printStackTrace();  
		} //catch (IOException e) {  
			//e.printStackTrace();  
		//}  

		Map<String, String> prop = new HashMap<String, String>();
		//ResourceBundle rb = ResourceBundle.getBundle("FILENAME");
//		Locale locale = new Locale("en", "US");
		ResourceBundle rb = ResourceBundle.getBundle("properties.db");
		String driver = rb.getString("db.driver"); 
		String url = rb.getString("db.url");
		String username = rb.getString("db.user"); 
		String password = rb.getString("db.password"); 

		prop.put("hibernate.connection.driver_class", driver);
		prop.put("hibernate.connection.url",url);
		prop.put("hibernate.connection.username",username);
		prop.put("hibernate.connection.password",password);

		if(emFactory ==  null)
		{
			emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME,prop);  
		} else{
			// use same instance of emfactory
		}
		//log.info("getEntityManager().. ");

		return emFactory.createEntityManager();

	}


}


