package com.jspiders.person_jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PersonUpdate {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter Name to update");
		String name = sc.next();
		System.out.println("Enter phone to update");
		int phone = sc.nextInt();
		String url = "jdbc:mysql://localhost:3306/person?user=root&password=admin";
		String query ="UPDATE PERSON SET NAME=? PHONE = ? WHERE ID=?";
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection c = DriverManager.getConnection(url);
		PreparedStatement p = c.prepareStatement(query);
		p.setInt(1, id);
		p.setString(2, name);
		p.setInt(3, phone);
		ResultSet r = p.executeQuery();
		while(r.next()) {
			System.out.println("Id " + r.getInt(1));
			System.out.println("Name: " + r.getString("name"));
			System.out.println("Phone No: " + r.getInt(3));
			System.out.println("------------*-*-------------------");
		}
		c.close();
	}
}
