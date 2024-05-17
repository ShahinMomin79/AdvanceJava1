package com.techno.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelect3 {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String driverpath="com.mysql.cj.jdbc.Driver";
	private static String dburl="jdbc:mysql://localhost:3306/project2?user=root&password=root";
	private static String Query;
	
	public static void main(String[] args) {
		
		try {
			Class.forName(driverpath);
			connection=DriverManager.getConnection(dburl);
			statement=connection.createStatement();
			Query="select * from dept";
			resultSet=statement.executeQuery(Query);
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"||"+resultSet.getString(2));
			}
			} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			if (connection!=null) {
			
					connection.close();
			}
			if (statement!=null) {
				statement.close();
			}
			if(resultSet!=null) {
				resultSet.close();
			}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		
		
	}

}
