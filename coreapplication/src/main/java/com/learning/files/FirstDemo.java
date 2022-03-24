package com.learning.files;

import java.io.File;
import java.io.IOException;

public class FirstDemo {

	public static void main(String[] args) {
		
		System.out.println("File Concept Begin.");
		try {
			File file = new File("hello1.txt");
			if(file.createNewFile()) {
				System.out.println("New file is created.");
			} else {
				System.out.println("File already exists.");
			}
			System.out.println("File Path: "+file.getPath());
			System.out.println("File Absolute Path: "+file.getAbsolutePath());
			
			File file2 = new File("F:\\Java8\\workspace\\coreapplication\\src\\main\\java\\com\\learning\\inheritance");
			String fileNames[] = file2.list();
			for(String readFile: fileNames) {
				System.out.println(readFile);
			}
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}	
		System.out.println("File Concept End.");
	}

}
