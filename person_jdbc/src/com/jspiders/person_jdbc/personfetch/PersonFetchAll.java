package com.jspiders.person_jdbc.personfetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
//import com.mysql.cj.protocol.Resultset;

public class PersonFetchAll {
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/person?user=root&password=admin";
		String query = "SELECT * FROM PERSON";
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection c = DriverManager.getConnection(url);
		PreparedStatement p = c.prepareStatement(query);
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
