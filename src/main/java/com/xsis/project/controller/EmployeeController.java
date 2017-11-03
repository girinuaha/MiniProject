package com.xsis.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.xsis.project.model.Publisher;
import com.xsis.project.model.Shelf;
import com.xsis.project.service.PublisherService;
import com.xsis.project.service.ShelfService;
import com.xsis.project.model.Employee;
import com.xsis.project.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	BorrowTransactionService borrowTransactionService;
	@Autowired
	ReturnTransactionService returnTransactionService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		
		return "employee";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute Employee employee) {
		employeeService.save(employee);
		return "redirect:/employee";
	}

	@RequestMapping(value = "/edit/{id}")
	@ResponseBody
	public Employee getEmployeeById(@PathVariable int id) {
		Employee result = employeeService.getEmployeeById(id);
		return result;
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody Employee employee) {
		employeeService.update(employee);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		employeeService.delete(id);
	}
}
