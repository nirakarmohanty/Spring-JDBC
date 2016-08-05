package com.nirakar.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class is used to test JDBC connection .
 * @author NIRAKAR
 * 
 */
public class TestJDBC {
 
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
							"system", "password");
			Statement stmt = con.createStatement();
			ResultSet rst = stmt.executeQuery("select * from MOVIE_DIECTORY");
			// System.out.println(rst.getString(0));
			while (rst.next()) {
				String columnname = rst.getString("rank");
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
