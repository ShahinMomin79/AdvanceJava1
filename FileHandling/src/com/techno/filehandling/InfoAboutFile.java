package com.techno.filehandling;

import java.io.File;

public class InfoAboutFile {

	  public static void main(String[] args) {
		File file=new File("file.txt");
		if(file.exists()) {
			System.out.println("name of the file is :"+ file.getName());
			System.out.println("length of the file is :"+file.length());
			System.out.println("absolute path of the file is :"+file.getAbsolutePath());
			if (file.canRead()) {
				System.out.println("file is readable");
			}else {
				System.out.println("file is not readable");
			}
			if(file.canWrite()) {
				System.out.println("file is writeble");
			}else {
				System.out.println("file is not writeble");
			}
			if (file.canExecute()) {
				System.out.println("file is executeble");
			}else {
				System.out.println("file cannot execuet");
			}
		}else {
			System.out.println("file does not exists");
		}
	}
}






