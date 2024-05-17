package com.techno.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
   public static void main(String[] args) {
         File file=new File("characterstream.txt");
         
         if(file.exists()) {
        	 try {
				FileReader reader=new FileReader(file);
				System.out.println(reader.read());
				reader.close();
				Scanner sc=new Scanner(file);
				if(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
				sc.close();
			} catch (IOException e) {
				
			}
        	 
         }else {
        	 System.out.println("file does not exists");
         }
}
}
