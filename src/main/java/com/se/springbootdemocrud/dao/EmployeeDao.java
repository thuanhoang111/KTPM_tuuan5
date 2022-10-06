package com.se.springbootdemocrud.dao;

import java.util.List;

import com.se.springbootdemocrud.entity.Employee;

public interface EmployeeDao {
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee employee);

	public void delete(int theId);
}
