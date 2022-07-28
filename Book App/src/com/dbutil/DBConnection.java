package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// as singleton
public class DBConnection {
	//private Connection connection;
	
	public Connection getConnection(String jdbcUrl, String userName, String userPwd) throws SQLException, ClassNotFoundException {
		
		Class.forName("org.postgresql.Driver");
		
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPwd);
		//this.connection = connection;
		return connection;
	}
}
