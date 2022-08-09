package com.dao;

import java.util.List;

import com.training.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getEmployeesList();
}
