package com.daoImpl;

import org.hibernate.Session;

import com.dao.EmployeeDao;
import com.training.Employee;
import com.training.HibernatePersistance;

public class EmployeeDaoImpl implements EmployeeDao {

	public void createEmployee(int empId, String firstName, String lastName) {
		Session session = HibernatePersistance.getSessionFactory()
				.openSession();
		
		session.beginTransaction();
		Employee employee = new Employee();
		
		// Make sure employee for storing in database
		employee.setId(2);
		employee.setFirstName("Suman");
		employee.setLastName("Vaibhav");
		
		// save employee to database
		Integer employeeId = (Integer) session.save(employee);
		session.getTransaction().commit();
		
		// get data from database
		employee = (Employee) session.get(Employee.class, employeeId);
		System.out.println(employee);
		
		// close session
		HibernatePersistance.shutdown();

	}

	public Employee getEmployee(Integer empId) {
		Session session = HibernatePersistance.getSessionFactory()
				.openSession();
		
		session.beginTransaction();
		Employee employee = new Employee();
		
		
		// get data from database
		employee = (Employee) session.get(Employee.class, empId);
		System.out.println(employee);
		
		// close session
		HibernatePersistance.shutdown();
		
		return employee;
	}

	public void updateEmployee(int empId, String firstName, String lastName) {
		

	}

	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub

	}

}
