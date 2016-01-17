package com.nirakar.springjdbc.dao.customer;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOImpl implements CustomerDAO{

	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {   
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	public int insert(Customer cust) {
		
		String query="insert into customer values('"+cust.getCustomerId()+"','"+cust.getCustomerName()+"')";  
			  
		return jdbcTemplate.update(query); 
		
	}

	
	
	
	
}
