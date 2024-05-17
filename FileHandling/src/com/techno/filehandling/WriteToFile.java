package com.techno.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) throws IOException {
		File file=new File("characterstream.txt");
		if(file.exists()) {
			System.out.println("yes file is present");
		}else {
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				
			}
		}
		
		FileWriter writer=new FileWriter(file);
		writer.write("data from java progamme");
		writer.close();
		System.out.println("data written to the file");
		
	}

}
