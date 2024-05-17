package com.techno.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytestream {
	public static void main(String[] args) {
		File file=new File("ByteStream.txt");
		if (file.exists()) {
			try {
				FileInputStream fileInputStream=new FileInputStream(file);
				System.out.print("data from file:");
				System.out.println(fileInputStream.read());
				fileInputStream.close();
			} catch (IOException e) {
				
			}
			
			
		}else {
			System.out.println("file is not present");
		}
	}

}
