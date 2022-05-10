package com.cts.TransformerMonitoring.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.TransformerMonitoring.exception.CriticalException;

public class DBConnectionManager {


	 
	 private static Connection con = null;
	 private static DBConnectionManager instance;
	public  DBConnectionManager()  throws CriticalException
	{
		FileInputStream fis=null;
		 
		// TYPE YOUR CODE HERE
	}
	public static DBConnectionManager getInstance() throws CriticalException {
		// TYPE YOUR CODE HERE

		if (instance == null) {
			instance= new DBConnectionManager();
			try {

			Properties prop = new Properties();
			InputStream fis = new FileInputStream("database.properties");
			prop.load(fis);
			Class.forName(prop.getProperty("DB_DRIVER_CLASS"));
			con = DriverManager.getConnection(prop.getProperty("DB_URL"),
			prop.getProperty("DB_USERNAME"),
			prop.getProperty("DB_PASSWORD"));

			} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	
		}
				return instance;
	}
	public Connection getConnection() {
		// TYPE YOUR CODE HERE
		return con;
	}
}
