package com.techno.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	//1.create a file 
	
	public static void main(String[] args) {
//		  File file=new File("file.txt");
		File file=new File("D:\\WEM6\\java1.txt");
		  if (file.exists()) {
			  System.out.println("file is already present");
		} else {
			 try {
					file.createNewFile();
					System.out.println("file is sucesfully created");
				} catch (IOException e) {
					
				}

		}
		 
	}
	

}
