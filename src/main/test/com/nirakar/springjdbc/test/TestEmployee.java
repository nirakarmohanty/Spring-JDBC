package com.nirakar.springjdbc.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;

import com.nirakar.springjdbc.dao.employee.Employee;

public class TestEmployee {

	@Test
	public void test() {
		Employee test = Mockito.mock(Employee.class);

		// test method return value
		when(test.getEmpId()).thenReturn(12);
		assertEquals(test.getEmpId(), 12);

		// Return multiple values
		@SuppressWarnings("unchecked")
		Iterator<String> i = mock(Iterator.class);
		when(i.next()).thenReturn("Nirakar").thenReturn("Mohanty");
		String result = i.next() + " " + i.next();
		assertEquals("Nirakar Mohanty", result);
		
		
		@SuppressWarnings("unchecked")
		Comparable<String> c= mock(Comparable.class);
		when(c.compareTo("Nirakar")).thenReturn(1);
		when(c.compareTo("Mohanty")).thenReturn(2);
		assertEquals(1,c.compareTo("Nirakar"));
		
		

	}
}
