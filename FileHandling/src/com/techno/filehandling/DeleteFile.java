package com.techno.filehandling;

import java.io.File;


public class DeleteFile {
	public static void main(String[] args) {
		File file=new File("file.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("file is sucessfully deleted");
		}
		else {
			System.out.println("file does not exists");
		}
		
	}

}
