package com.training;

public class Department {
	private int dept_id;
	private String dept_name;
	private String dept_location;
	
	public Department() {
		
	}
	
	public Department(int dept_id, String dept_name, String dept_location) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.dept_location = dept_location;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDept_location() {
		return dept_location;
	}

	public void setDept_location(String dept_location) {
		this.dept_location = dept_location;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", dept_location=" + dept_location + "]";
	}
	
	
}
