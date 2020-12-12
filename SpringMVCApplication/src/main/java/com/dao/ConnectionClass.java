package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	public Connection getConnection()
	{
		Connection connection=null;
		
		String driverName="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/online_fund_transfer";
		String userName="student";
		String password="student";
		
		try {
			Class.forName(driverName);
			
			connection=DriverManager.getConnection(url,userName,password);
			System.out.println(connection!=null?"Connection Established":"Connection Failed");
			return connection;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
