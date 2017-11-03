package com.xsis.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xsis.project.dao.EmployeeDao;
import com.xsis.project.model.Employee;

@Transactional
@Service
public class EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;
	
		public void save(Employee employee){
		employeeDao.save(employee);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}
	
	public void update(Employee employee) {
		employeeDao.update(employee);
	}
	
	public void delete(int id) {
		employeeDao.delete(id);
	}

}
