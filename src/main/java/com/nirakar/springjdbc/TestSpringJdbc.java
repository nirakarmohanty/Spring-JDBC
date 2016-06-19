package com.nirakar.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nirakar.springjdbc.dao.customer.Customer;
import com.nirakar.springjdbc.dao.customer.CustomerDAO;
import com.nirakar.springjdbc.dao.employee.Employee;
import com.nirakar.springjdbc.dao.employee.EmployeeDAO;

public class TestSpringJdbc {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-test.xml");
		Employee e1 = (Employee)ctx.getBean("employee");
		System.out.println(e1.getEmpId() + " " +e1.getEmpName());

		
		EmployeeDAO employeeDAO = (EmployeeDAO) ctx.getBean("employeeDAO");
		employeeDAO.findEmployee(1);
        //System.out.println(customer1);
		Customer cust = new Customer();
		cust.setCustomerId(12); 
		cust.setCustomerName("Nirakar Mohanty");
		
		CustomerDAO customerDAO = (CustomerDAO)ctx.getBean("customerDAO");
		int status=customerDAO.insert(cust);
        System.out.println(status);
        
	}

}