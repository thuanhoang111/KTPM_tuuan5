package com.se.springbootdemocrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.se.springbootdemocrud.entity.Employee;

@Repository
public class EmployeeDaoHibernateImpl implements EmployeeDao {

	private EntityManager entityManager;

	@Autowired
	public EmployeeDaoHibernateImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {

		Query theQuery = (Query) entityManager.createQuery("from Employee");
		List<Employee> employees = theQuery.getResultList();
		return employees;

	}

	@Override
	@Transactional
	public Employee findById(int theId) {

		Employee theEmployee = entityManager.find(Employee.class, theId);
		return theEmployee;
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		Employee dbEmployee = entityManager.merge(employee);
		employee.setId(dbEmployee.getId());
	}

	@Override
	@Transactional
	public void delete(int theId) {
		Query theQuery = (Query) entityManager.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();

	}

}
