package com.nirakar.spring.jdbc.dao.customer;

/**
 * @author NIRAKAR
 *
 */
public class Customer {

	/**
	 * Variable used for customer name.
	 */
	private String customerName;
	/**
	 * variable used for customer id.
	 */
	private int customerId;

	/**
	 * @return
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
