package com.learning.files;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SecondDemo {

	public static void main(String[] args) {
		
		FileDescriptor fd = null;
		byte[] b = {'o', 'r', 'a', 'c', 'l', 'e'};
		String str = "Hello world, this is my File Description demo.";
		try {
			FileInputStream fis = new FileInputStream("hello.txt");
			FileOutputStream fos = new FileOutputStream("hello.txt");
			fd = fos.getFD();
			fos.write(str.getBytes());
			fos.flush();
			fd.sync(); // confirms data to be written to the disk
			int value = 0;
			// for every available bytes
			while((value=fis.read())!=-1) {
				char ch = (char)value;
				System.out.print(ch);
			}
			System.out.println("\nSync successfully executed.");		
			fis.close();
			fos.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		} 

	}

}
