package com.serviceImpl;

import java.util.List;

import com.daoImpl.EmployeeDaoImpl;
import com.service.EmployeeService;
import com.training.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDaoImpl emp = new EmployeeDaoImpl();
	
	public void addEmployee(Employee employee) {
		
		emp.addEmployee(employee);
		System.out.println("Insertion Successfull");
	}

	public void updateEmployee(Employee employee) {
		
		emp.updateEmployee(employee);
		System.out.println("Updation Successfull");
	}

	public void deleteEmployee(Employee employee) {
		
		emp.deleteEmployee(employee);
		System.out.println("Deletion Successfull");
	}

	public Employee getEmployee(int id) {
		
		Employee employee = emp.getEmployee(id);
		return employee;
	}

	public List<Employee> getEmployeesList() {
		
		return null;
	}

}
