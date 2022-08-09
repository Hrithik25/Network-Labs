package com.training;

import org.hibernate.Session;

import com.serviceImpl.EmployeeServiceImpl;

public class Program {
	public static void main(String[] args) {
		/*Session session = HibernatePersistance.getSessionFactory()
				.openSession();
		
		session.beginTransaction();
		Employee employee = new Employee();
		
		// Make sure employee for storing in database
		
		employee.setFirstName("Sakshi");
		employee.setLastName("Singh");
		
		// save employee to database
		Integer employeeId = (Integer) session.save(employee);
		session.getTransaction().commit();
		
		// get data from database
		employee = (Employee) session.get(Employee.class, employeeId);
		System.out.println(employee);
		
		// close session
		HibernatePersistance.shutdown();*/
		
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Employee e1 = new Employee();
		e1.setFirstName("Abhishek");
		e1.setLastName("Kumar");
		
		emp.addEmployee(e1);
		
	}
}
