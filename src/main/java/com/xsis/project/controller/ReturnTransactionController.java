package com.xsis.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xsis.project.model.Employee;
import com.xsis.project.model.RentHistory;
import com.xsis.project.model.ReturnTransaction;
import com.xsis.project.service.EmployeeService;
import com.xsis.project.service.RentHistoryService;

@Controller
@RequestMapping("/returnTransaction")
public class ReturnTransactionController {

	/*@Autowired
	ReturnTransactionService returnTransactionService;*/
	@Autowired
	EmployeeService employeeService;
	@Autowired
	RentHistoryService rentHistoryService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		/*List<ReturnTransaction> returnTransactions = returnTransactionService.getAllReturnTransactions();
		model.addAttribute("returnTransactions", returnTransactions);*/
		
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employees", employees);
		
		List<RentHistory> rentHistorys = rentHistoryService.getAllHistories();
		model.addAttribute("rentHistorys", rentHistorys);
		
		return "rentHistory";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savingData(@ModelAttribute ReturnTransaction returnTransaction) {
		//returnTransactionService.save(returnTransaction);
		return "redirect:/rentHistory";
	}

}
