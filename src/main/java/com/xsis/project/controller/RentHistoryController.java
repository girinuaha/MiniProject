package com.xsis.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xsis.project.service.RentHistoryService;

@Controller
@RequestMapping("/rent_history")
public class RentHistoryController {
	
	@Autowired
	RentHistoryService rentHistoryService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "rent-history";
	}
}
