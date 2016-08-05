package com.nirakar.springjdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
							"system", "password");
			Statement stmt = con.createStatement();
			ResultSet rst = stmt.executeQuery("select * from employee");
			//System.out.println(rst.getString(0));
			while (rst.next()) {
			    String columnname = rst.getString("empID");
			    System.out.println(columnname);
			}
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
