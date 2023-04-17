package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class FileCreate3 {
	public static void main(String[] args) {
		File file = new File("wejm5.txt");
		
		if(file.exists()) {
			System.out.println("File is Already exist...!!");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("File Created Successfully...!!");
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println("File Not Created...!!");
			}
		}
	}
}
