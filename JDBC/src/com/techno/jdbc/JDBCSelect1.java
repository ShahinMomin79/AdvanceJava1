package com.techno.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect1 {
	//1.load Driver class
	//2.open connection
	//3.create/prepare statement
	//4.process result
	//5.close connection
	
	public static void main(String[] args) {
		
		try {
			//1.Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//open connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?user=root&password=root");
			//prepare statement
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select * from dept");
			//process the result
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"||"+resultSet.getString(2));
			}
			//close connection
			connection.close();
			statement.close();
			resultSet.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}