package com.techno.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCSelect2 {
	public static void main(String[] args) {
		//1.load driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.open connection 
		Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/project2?user=root&password=root");
		//3.statements
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from emp");
		//4.process the result
		while (resultSet.next()) {
//			System.out.println(resultSet.getInt(1)+" || "+resultSet.getString(2));
			System.out.println(resultSet.getString(1)+" || "+resultSet.getInt(2)+" || "+resultSet.getInt(3));
		}
		//5.close connection
		connection.close();
		statement.close();
		resultSet.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}



 



















