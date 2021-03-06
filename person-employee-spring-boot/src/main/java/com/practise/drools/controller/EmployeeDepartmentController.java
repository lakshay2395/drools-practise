package com.practise.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practise.drools.service.EmployeeDepartmentService;

@RestController
public class EmployeeDepartmentController {
	
	@Autowired
	EmployeeDepartmentService service;
	
	@RequestMapping(path="/employee-department-example",method=RequestMethod.GET)
	public void printAllEmployeeDepartment() {
		service.printAllEmployeeDepartment();
	}

}
