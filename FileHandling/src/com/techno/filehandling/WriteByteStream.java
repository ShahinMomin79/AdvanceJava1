package com.techno.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteStream {
	public static void main(String[] args) {
		File file=new File("ByteStream.txt");
		if (file.exists()) {
			System.out.println("yes file is present");
			
		}else {
			try {
				file.createNewFile();
				System.out.println("file is created");
			} catch (IOException e) {
				
			}
		}
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			
			fileOutputStream.write(97);
			System.out.println("data sucessfully written to the file");
			fileOutputStream.close();
		} catch (IOException e) {
			
		}
		
	}

}
