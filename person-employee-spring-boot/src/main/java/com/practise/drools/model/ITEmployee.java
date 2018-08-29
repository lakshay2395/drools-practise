package com.practise.drools.model;

public class ITEmployee {
	
	public Employee employee;

	public ITEmployee(Employee employee) {
		super();
		this.employee = employee;
	}

	public ITEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "ITEmployee [employee=" + employee + "]";
	}
	

}
