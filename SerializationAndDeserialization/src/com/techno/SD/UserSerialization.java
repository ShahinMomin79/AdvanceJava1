package com.techno.SD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSerialization {
	
	public static void main(String[] args) {
		File file=new File("UserSeriallization.txt");
		if (file.exists()) {
			System.out.println("yes , file is present");
		}else {
			try {
				file.createNewFile();
				System.out.println("file is created");
			} catch (IOException e) {
				
			}
		}
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			User user=new User(1, "tanaya", "t@2024", "tanaya34", "t1234");
			objectOutputStream.writeObject(user);
			System.out.println("object written in file");
			fileOutputStream.close();
			objectOutputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	

}


