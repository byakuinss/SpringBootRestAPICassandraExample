package com.test.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.EmployeeDAO;
import com.test.entity.Employee;
import com.test.util.MyCassandraTemplate;

/**
 * DAOImpl class for Employee to perform CRUD operation.
 * @author Grace Yu
 * @version 1.0
 */

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private MyCassandraTemplate myCassandraTemplate;
	
	@Override
	public Employee createEmployee(Employee employee){
		return myCassandraTemplate.create(employee);
	}
	
	@Override
	public Employee getEmployee(int id){
		return myCassandraTemplate.findById(id, Employee.class);
	}
	
	@Override
	public Employee updateEmployee(Employee employee){
		return myCassandraTemplate.update(employee, Employee.class);
	}
	
	@Override
	public void deleteEmployee(int id){
		myCassandraTemplate.deleteById(id, Employee.class);
	}
	
	@Override
	public List<Employee> getAllEmployees(){
		return myCassandraTemplate.findAll(Employee.class);
	}

}
