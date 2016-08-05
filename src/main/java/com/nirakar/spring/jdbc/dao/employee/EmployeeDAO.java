package com.nirakar.spring.jdbc.dao.employee;


public interface EmployeeDAO {
	
	public void findEmployee(int empId);
	
	public boolean insert(Employee e);

}
