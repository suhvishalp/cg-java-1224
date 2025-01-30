package com.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String DB_URL = "";
	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	
	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException("Error creating DB Connection");
		}
		
	}
}
