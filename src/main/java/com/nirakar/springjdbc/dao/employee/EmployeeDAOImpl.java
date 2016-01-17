package com.nirakar.springjdbc.dao.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void findEmployee(int empId) {
		String sql = "SELECT * FROM EMPLOYEE WHERE empId = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, empId);
			// Employee employee = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				/*
				 * employee = new Customer( rs.getInt("CUST_ID"),
				 * rs.getString("NAME"), rs.getInt("Age") );
				 */
				System.out
						.println(rs.getInt("empId") + rs.getString("empName"));
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public boolean insert(Employee e) {
		// TODO Auto-generated method stub
		return false;
	}

}
