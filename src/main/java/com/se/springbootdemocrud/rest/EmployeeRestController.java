package com.se.springbootdemocrud.rest;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootdemocrud.dao.EmployeeDao;
import com.se.springbootdemocrud.entity.Employee;

@RestController
@RequestMapping("api")
public class EmployeeRestController {
	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeRestController(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	};

	@GetMapping("employees")
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee theEmployee = employeeDao.findById(employeeId);
		if (theEmployee == null) {
			throw new RuntimeException("Employee id not found -" + employeeId);
		}
		return theEmployee;
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		theEmployee.setId(0);
		employeeDao.save(theEmployee);
		return theEmployee;
	}

	@PutMapping("employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeDao.save(theEmployee);
		return theEmployee;
	}

	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee tempEmployee = employeeDao.findById(employeeId);
		if (tempEmployee == null) {
			throw new RuntimeException("Employee id not found -" + employeeId);
		}
		employeeDao.delete(employeeId);
		return "delete employee id - " + employeeId;
	}

}
