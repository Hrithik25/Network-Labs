package com.service;

import java.util.List;

import com.training.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getEmployeesList();
}
