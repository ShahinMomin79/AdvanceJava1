package com.techno.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCPrepareInsert {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static int result;
	private static FileReader fileReader;
	private static Properties properties;
	private static String filepath="D:\\\\\\\\AdvanceJavaBatch1\\\\\\\\JDBC\\\\\\\\resources\\\\\\\\db_info.properties";
	private static String Query;
	private static Scanner scanner;
	public static void main(String[] args) {
		 try {
			fileReader=new FileReader(filepath);
			properties=new Properties();
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverpath"));
			connection=DriverManager.getConnection(properties.getProperty("url"),properties);
			Query="insert into dept values (?,?)";
			preparedStatement=connection.prepareStatement(Query);
			 scanner=new Scanner(System.in);
			System.out.println("enter id and dname");
			preparedStatement.setInt(1, scanner.nextInt());
			preparedStatement.setString(2, scanner.next());
			
			result=preparedStatement.executeUpdate();
			System.out.println("Query okk "+result+" rows affected");
		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connection!=null) {
					connection.close();
				}
				if (preparedStatement!=null) {
					preparedStatement.close();
				}if (scanner!=null) {
					scanner.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}