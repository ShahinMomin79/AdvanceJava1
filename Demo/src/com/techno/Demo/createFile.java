package com.techno.Demo;

import java.io.File;
import java.io.IOException;

public class createFile {

	 public static void main(String[] args) {
		 File file=new File("Demo.txt");
		 try {
			file.createNewFile();
			System.out.println("file is created");
		} catch (IOException e) {
			
		}
		System.out.println();
	}
}
