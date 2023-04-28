package com.jspiders.person_jdbc.personinsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PersonInsert {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Phone No.");
		int ph = sc.nextInt();
		
		String url = "jdbc:mysql://localhost:3306/person?user=root&password=admin";
		String query = "INSERT INTO PERSON VALUES(?,?,?)";
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement p = connection.prepareStatement(query);
		p.setInt(1, id);
		p.setString(2, name);
		p.setInt(3, ph);
		int count = p.executeUpdate();
		if(count == 1 ) {
			System.out.println("Inserted succesfully...");
		}
		else {
			System.out.println("Not inserted..");
		}
		connection.close();
	}
}
