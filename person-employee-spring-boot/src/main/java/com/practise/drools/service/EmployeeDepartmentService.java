package com.practise.drools.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practise.drools.listener.TracingEmployeeEventListener;
import com.practise.drools.model.Department;
import com.practise.drools.model.Employee;

@Component
public class EmployeeDepartmentService {
	
	@Autowired
	KieContainer container;
	
	public void printAllEmployeeDepartment() {
		//Sample Departments
		Department d1 = new Department();
		d1.setName("IT");
		
		Department d2 = new Department();
		d2.setName("CS");
		
		//Sample Employees
		Employee e1 = new Employee();
		e1.setName("Lakshay");
		e1.setDepartment(d1);
		e1.setManager(true);
		
		Employee e2 = new Employee();
		e2.setName("Piyush");
		e2.setDepartment(d2);
		
		Employee e3 = new Employee();
		e3.setName("Harshita");
		e3.setDepartment(d1);
		
		KieSession session = container.newKieSession();
		session.addEventListener(new TracingEmployeeEventListener());
		session.insert(d1);
		session.insert(d2);
		session.insert(e1);
		session.insert(e2);
		session.insert(e3);
		session.fireAllRules();
		session.dispose();
	}
	
}
