package com.practise.drools.model;

public class ITManager {
	
	public Employee employee;

	public ITManager(Employee employee) {
		super();
		this.employee = employee;
	}

	public ITManager() {
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
		return "ITManager [employee=" + employee + "]";
	}

}
