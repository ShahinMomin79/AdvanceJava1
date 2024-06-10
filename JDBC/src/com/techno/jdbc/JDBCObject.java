package com.techno.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCObject {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
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
			Query="insert into emp values (?,?,?)";
			preparedStatement=connection.prepareStatement(Query);
			
			Employee employee=new Employee();
			employee.setEname("smith2");
			employee.setDeptno(20);
			employee.setSal(8000);
			
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setInt(2, employee.getSal());
			preparedStatement.setInt(3, employee.getDeptno());
			
			result=preparedStatement.executeUpdate();
			System.out.println("Query ok "+result+" rows affected");
			
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if (connection!=null) {
					connection.close();
				}
				if (preparedStatement!=null) {
					preparedStatement.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}



























