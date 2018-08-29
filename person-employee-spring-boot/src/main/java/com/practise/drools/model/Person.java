package com.practise.drools.model;

public class Person {
	
	private String name;
	
	private float time;
	
	private String message;

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", time=" + time + ", message=" + message + "]";
	}
}
