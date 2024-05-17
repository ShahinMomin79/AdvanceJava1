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

public class JDBCSelect5 {
     private static Connection connection;
     private static Statement statement;
     private static ResultSet resultSet;
     private static FileReader fileReader;
 	private static Properties properties;
 	private static String Query;
 	private static String filepath="D:\\\\AdvanceJavaBatch1\\\\JDBC\\\\resources\\\\db_info.properties";
 	
 	public static void main(String[] args) {
 		
 		
		try {
			fileReader=new FileReader(filepath);
	 		properties=new Properties();
	 		properties.load(fileReader);
			Class.forName(properties.getProperty("driverpath"));
		connection=	DriverManager.getConnection(properties.getProperty("url"),properties);
		statement=connection.createStatement();
		resultSet=statement.executeQuery("select * from dept");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1)+"==="+resultSet.getString(2));
		}
		} catch (ClassNotFoundException | IOException | SQLException e) {
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
				}}
	}
}