package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.model.SignUp;
import com.service.AccountSummary;

@Repository("accountSummaryDaoImpl")
public class AccountSummaryDaoImpl implements AccountSummaryDao{

	public SignUp getAccountSummary(int cust_id) {
		
		ConnectionClass connectionClass=null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String SQLQuery="SELECT * FROM account_details WHERE cust_id=?";
		SignUp signUp=new SignUp();
		connectionClass=new ConnectionClass();
		connection=connectionClass.getConnection();
		try {
			preparedStatement=connection.prepareStatement(SQLQuery);
			preparedStatement.setInt(1,cust_id);
			resultSet=preparedStatement.executeQuery();
		    while(resultSet.next())
		    {
		    	signUp.setAccountHolderName(resultSet.getString("cust_name"));
				signUp.setAccountNumber(resultSet.getString("cust_accnumber"));
				signUp.setBankName(resultSet.getString("cust_bank_name"));
				signUp.setEmailAddress(resultSet.getString("cust_emailid"));
				signUp.setCurrentBalance(resultSet.getDouble("cust_available_balance"));
				signUp.setPassword(resultSet.getString("cust_password"));	
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
		return signUp;
	}

}
