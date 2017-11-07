package com.xsis.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xsis.project.model.Book;
import com.xsis.project.model.BorrowTransaction;
import com.xsis.project.model.Customer;
import com.xsis.project.model.Employee;
import com.xsis.project.service.BookService;
import com.xsis.project.service.BorrowTransactionService;
import com.xsis.project.service.CustomerService;
import com.xsis.project.service.EmployeeService;

@Controller
@RequestMapping("/borrow_transaction")
public class BorrowTransactionController {
	
	@Autowired
	BorrowTransactionService borrowTransactionService;
	@Autowired
	CustomerService customerService;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	BookService bookService;	
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		List<Customer> customers = customerService.getAllCustomers();
		model.addAttribute("customers", customers);
		
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		
		List<Book> books = bookService.getAllBook();
		model.addAttribute("books", books);
		return "borrow-transaction";
	}
	
	@RequestMapping(value="/save")
	public String save(@ModelAttribute BorrowTransaction borrowTransaction) {
		borrowTransactionService.save(borrowTransaction);
		return "redirect:/rent_history";
	}
}
