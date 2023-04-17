package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class FileCreate2 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Shubham\\OneDrive\\Desktop\\WEJM5_tASK");
		try {
			file.createNewFile();
			System.out.println("File Created Successfully...!!");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("File Not Created...!!");
		}
	}
}
