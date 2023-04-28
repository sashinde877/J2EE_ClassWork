package com.jspiders.person_jdbc.personfetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PersonFetchByName {
	public static void main(String[] args) throws SQLException {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name You want to search..");
		String name = sc.next();
		
		String url = "jdbc:mysql://localhost:3306/person?user=root&password=admin";
		String query = "SELECT * FROM PERSON WHERE NAME = ?";
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection c = DriverManager.getConnection(url);
		PreparedStatement p = c.prepareStatement(query);
		
		p.setString(1, name);
		ResultSet r= p.executeQuery();
		while(r.next()) {
			System.out.println("Id " + r.getInt(1));
			System.out.println("Name: " + r.getString("name"));
			System.out.println("Phone No: " + r.getInt(3));
			System.out.println("------------*-*-------------------");
		}
		c.close();
	}
}

