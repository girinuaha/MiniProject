package com.xsis.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.xsis.project.model.BookTransaction;
import com.xsis.project.model.BorrowTransaction;
import com.xsis.project.model.Employee;
import com.xsis.project.model.RentHistory;
import com.xsis.project.service.BookTransactionService;
import com.xsis.project.service.EmployeeService;
import com.xsis.project.service.RentHistoryService;

@Controller
@RequestMapping("/rent_history")
public class RentHistoryController {
	
	@Autowired
	RentHistoryService rentHistoryService;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	BookTransactionService bookTransactionService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		List<RentHistory> rentHistories = rentHistoryService.getAllHistories();
		model.addAttribute("rentHistories", rentHistories);
		
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		
		return "rent-history";
	}
	
	@RequestMapping(value="/edit/{id}")
	@ResponseBody
	public RentHistory getHistoryById(@PathVariable int id) {
		RentHistory result = rentHistoryService.getHistoryById(id);
		BorrowTransaction borrowTransaction = result.getBorrowTransaction();
		List<BookTransaction> bookTransactions = bookTransactionService.getBookTransactionByBorrowTransaction(borrowTransaction);
		result.getBorrowTransaction().setBookTransaction(bookTransactions);
		return result;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody RentHistory rentHistory) {
		rentHistoryService.update(rentHistory);
	}
}
