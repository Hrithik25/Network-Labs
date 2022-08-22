package com.dao;

import com.training.Employee;

public interface EmployeeDao {
	public void createEmployee(int empId, String firstName, String lastName);
	public Employee getEmployee(int empId);
	public void updateEmployee(int empId, String firstName, String lastName);
	public void deleteEmployee(int empId);
}
