package com.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.dao.EmployeeDao;
import com.training.Employee;
import com.training.HibernatePersistance;

public class EmployeeDaoImpl extends BaseDaoImpl implements EmployeeDao {

	public void addEmployee(Employee employee) {
		super.add(employee);
	}

	public void updateEmployee(Employee employee) {
		super.update(employee);
	}

	public void deleteEmployee(Employee employee) {
		super.delete(employee);
	}

	public Employee getEmployee(int id) {
		
		Employee employee = (Employee) super.get(id);
		
		return employee;
	}

	public List<Employee> getEmployeesList() {
		
		return null;
	}

}
