package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.model.SignUp;

@Repository
public class SignUpDaoImpl implements SignUpDao {

	public boolean doesAccountExists(SignUp signUp) {
		
		ConnectionClass connectionClass;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	    ResultSet resultSet;
		connectionClass=new ConnectionClass();
		connection=connectionClass.getConnection();
		
	    int cust_count=0;
		String SQLQuery="SELECT COUNT(cust_id) AS cust_count FROM account_details WHERE cust_emailid=?";
	
		try {
			preparedStatement=connection.prepareStatement(SQLQuery);
			preparedStatement.setString(1,signUp.getEmailAddress());
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				cust_count=resultSet.getInt("cust_count");
				System.out.println(cust_count);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(cust_count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void createAccount(SignUp signUp) {
		ConnectionClass connectionClass =null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		String sqlQuery = "INSERT INTO account_details(cust_name,cust_accnumber,cust_bank_name,cust_emailid,cust_available_balance,"
				+ "cust_password) VALUES(?,?,?,?,?,?)";
		try {
			connectionClass=new ConnectionClass();
			connection = connectionClass.getConnection();
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, signUp.getAccountHolderName());
			preparedStatement.setString(2, signUp.getAccountNumber());
			preparedStatement.setString(3, signUp.getBankName());
			preparedStatement.setString(4, signUp.getEmailAddress());
			preparedStatement.setDouble(5, 0.0);
			preparedStatement.setString(6, signUp.getPassword());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	
}
