package com.nirakar.springjdbc.dao.employee;


public interface EmployeeDAO {
	
	public void findEmployee(int empId);
	
	public boolean insert(Employee e);

}
