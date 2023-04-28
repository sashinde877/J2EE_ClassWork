package com.jspiders.jdbc.studentdelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class StudentDelete {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();		
		
		String url = "jdbc:mysql://localhost:3306/studentdb?user=root&password=admin";
		String query = "DELETE FROM STUDENT WHERE ID =?";
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement p = connection.prepareStatement(query);
		p.setInt(1,id);
		int count = p.executeUpdate();// p.execute() also we can use 
		if(count == 1 ) {
			System.out.println("Delete  succesfully...");
		}
		else {
			System.out.println("Not Deleted..");
		}
		connection.close();
	}
}
