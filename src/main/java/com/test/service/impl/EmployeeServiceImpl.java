package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.test.dao.impl.EmployeeDAOImpl;
import com.test.dao.EmployeeDAO;
import com.test.entity.Employee;
import com.test.service.EmployeeService;

/**
 * Service Impl class for Employee to perform CRUD operation.
 * 
 * @author Grace Yu
 * @version 1.0
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired  
    private EmployeeDAO employeeDAO;

    /**
     * Default Constructor
     */
    public EmployeeServiceImpl() {
        super();    
    }

    @Override   
    public Employee createEmployee(Employee employee) {     
        return employeeDAO.createEmployee(employee);
    }

    @Override   
    public Employee getEmployee(int id) {       
        return employeeDAO.getEmployee(id);
    }

    @Override   
    public Employee updateEmployee(Employee employee) {     
        return employeeDAO.updateEmployee(employee);
    }

    @Override   
    public void deleteEmployee(int id) {        
        employeeDAO.deleteEmployee(id);
    }

    @Override   
    public List<Employee> getAllEmployees() {       
        return employeeDAO.getAllEmployees();
    }

}