package com.practise.drools.model;

public class Employee {
	
	public String name;
	
	public Department department;
	
	public Boolean manager = false;

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Boolean getManager() {
		return manager;
	}

	public void setManager(Boolean manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", manager=" + manager + "]";
	}
}
