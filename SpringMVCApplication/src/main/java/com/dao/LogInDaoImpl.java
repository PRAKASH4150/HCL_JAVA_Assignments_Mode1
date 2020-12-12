package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.appexception.ApplicationException;
import com.model.LogIn;

@Repository
public class LogInDaoImpl implements LogInDao{

	public int doesUserExists(LogIn logIn) {
		ConnectionClass connectionClass;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	    ResultSet resultSet;
	    int cust_count=0;
		String SQLQuery="SELECT COUNT(cust_id) AS cust_count FROM account_details WHERE cust_emailid=?";
		connectionClass=new ConnectionClass();
		connection=connectionClass.getConnection();
		try {
			preparedStatement=connection.prepareStatement(SQLQuery);
			preparedStatement.setString(1,logIn.getEmailId());
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				cust_count=resultSet.getInt("cust_count");
				System.out.println("Exists:"+cust_count);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return cust_count;
	}

	public int checkUserCredentials(LogIn logIn) throws ApplicationException {
		ConnectionClass connectionClass;
		Connection connection = null;
		PreparedStatement preparedStatement1 = null;
		PreparedStatement preparedStatement2 = null;
	    ResultSet resultSet;
	    
	    int cust_id=0;
	    int cust_count=0;
        
	    String SQLQuery1="SELECT count(cust_id) AS cust_count  FROM account_details WHERE cust_emailid=? AND cust_password=?"; 
	    String SQLQuery2="SELECT cust_id FROM account_details WHERE cust_emailid= ? AND cust_password= ?";
	    
		connectionClass=new ConnectionClass();
		connection=connectionClass.getConnection();
		try {
			preparedStatement1=connection.prepareStatement(SQLQuery1);
			preparedStatement1.setString(1,logIn.getEmailId());
			preparedStatement1.setString(2, logIn.getPassword());
			resultSet=preparedStatement1.executeQuery();
			
			while(resultSet.next())
			{
				cust_count=resultSet.getInt("cust_count");
			}
			if(cust_count==0)
			{
				throw new ApplicationException("Incorrect Password");
			}
			else
			{
				preparedStatement2=connection.prepareStatement(SQLQuery2);
				preparedStatement2.setString(1,logIn.getEmailId());
				preparedStatement2.setString(2, logIn.getPassword());
				resultSet=preparedStatement2.executeQuery();
				while(resultSet.next())
				{
					cust_id=resultSet.getInt("cust_id");
					System.out.println("cust_id:"+cust_id);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				preparedStatement1.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return cust_id;
	}

}
