package com.techno.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCCallable {
	
	 private static Connection connection;
	 private static CallableStatement callableStatement;
	 private static int result;
		private static FileReader fileReader;
		private static Properties properties;
		private static String filepath="D:\\\\\\\\AdvanceJavaBatch1\\\\\\\\JDBC\\\\\\\\resources\\\\\\\\db_info.properties";
		private static String Query;
		
	public static void main(String[] args) {
		try {
			fileReader=new FileReader(filepath);
			properties=new Properties();
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverpath"));
		connection=DriverManager.getConnection(properties.getProperty("url"),properties);
		Query="call proc2()";
		callableStatement=connection.prepareCall(Query);
		result=callableStatement.executeUpdate();
		System.out.println("Query ok"+ result+" rows affected");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connection!=null) {
					connection.close();
				}
				if (callableStatement!=null) {
					callableStatement.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
