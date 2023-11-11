package com.connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountDatabaseConnector 
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	//method for database connection
	
	public void connect()
	{
		//loading driver class into memory
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
