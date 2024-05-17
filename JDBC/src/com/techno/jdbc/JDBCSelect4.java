package com.techno.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCSelect4 {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static String Driverpath="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/project2?";
	private static FileReader fileReader;
	private static Properties properties;
	private static String Query;
	
	public static void main(String[] args) {
		   try {
			Class.forName(Driverpath);
			
			
			fileReader=new FileReader("D:\\AdvanceJavaBatch1\\JDBC\\resources\\db_info.properties");
			properties=new Properties();
			properties.load(fileReader);
			
			connection=DriverManager.getConnection(url, properties);
			statement=connection.createStatement();
			Query="select * from dept";
			resultSet=statement.executeQuery(Query);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"---"+resultSet.getString(2));
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   finally {
			try {
				if (connection!=null) {
					connection.close();
				}
				if (statement!=null) {
					statement.close();
				}if (resultSet!=null) {
					resultSet.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}