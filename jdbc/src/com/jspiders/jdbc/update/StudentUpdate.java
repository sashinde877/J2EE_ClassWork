package com.jspiders.jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class StudentUpdate {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the phone number");
		long phone = sc.nextLong();
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		System.out.println("Enter the email");
		String email = sc.next();
		
		
		String url = "jdbc:mysql://localhost:3306/studentdb?user=root&password=admin";
		String query = "UPDATE STUDENT SET NAME=?, PHONE=?, MARKS=?, EMAIL=? WHERE ID=?";
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement p = connection.prepareStatement(query);
		p.setString(1, name);
		p.setLong(2, phone);
		p.setInt(3, marks);
		p.setString(4, email);
		p.setInt(5,id);
		int count = p.executeUpdate();// p.execute() also we can use 
		if(count == 1 ) {
			System.out.println("Inserted succesfully...");
		}
		else {
			System.out.println("Not inserted..");
		}
		connection.close();
	}
}
