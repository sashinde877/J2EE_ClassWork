package com.jspiders.filehandling.info;

import java.io.File;
import java.io.IOException;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("wejm5.txt");
		if(file.exists()) {
			System.out.println("File Aleready exist...");
		}
		else {
			try {
				file.createNewFile();
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println("File created successfully...");
			}
		}
		System.out.println("File name: " + file.getName());
		System.out.println("File path: " + file.getAbsolutePath());
		System.out.println("File length: " + file.length());
		if(file.canRead()) {
			System.out.println("File is readable");
		}else {
			System.out.println("File is not readable..");
		}
		if(file.canWrite()) {
			System.out.println("File is writable");
		}else {
			System.out.println("File is not writable..");
		}
		if(file.canExecute()) {
			System.out.println("File is Executable");
		}else {
			System.out.println("File is not Exeutable..");
		}
	}
}
