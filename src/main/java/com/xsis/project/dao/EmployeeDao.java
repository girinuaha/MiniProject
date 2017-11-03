package com.xsis.project.dao;

import java.util.List;

import com.xsis.project.model.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmployees();

	void save(Employee employee);

	Employee getEmployeeById(int id);

	void update(Employee employee);

	void delete(int id);

}
