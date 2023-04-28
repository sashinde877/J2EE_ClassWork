package com.jspiders.person_jdbc.persondelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class PersonDelete {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		String url = "jdbc:mysql://localhost:3306/person?user=root&password=admin";
		String query = "DELETE FROM PERSON WHERE ID=?";
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection c = DriverManager.getConnection(url);
		PreparedStatement p = c.prepareStatement(query);
		p.setInt(1, id);
		int count = p.executeUpdate();
		if(count == 1) {
			System.out.println("Deleted successfully..");
		}
		else {
			System.out.println("Deleted unsuccessful..");
		}
		
	}
}
