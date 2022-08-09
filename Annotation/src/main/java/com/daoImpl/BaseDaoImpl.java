package com.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.training.Employee;
import com.training.HibernatePersistance;

public class BaseDaoImpl {
	public void add(Employee employee) {
		Session session = HibernatePersistance.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(employee);
		System.out.println("Inserstion Successfull");
		session.getTransaction().commit();
		
		session.close();
		HibernatePersistance.shutdown();
	}

	public void update(Employee employee) {
		Session session = HibernatePersistance.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.update(employee);
		System.out.println("Updation Successfull");
		session.getTransaction().commit();
		
		session.close();
		HibernatePersistance.shutdown();
	}

	public void delete(Employee employee) {
		Session session = HibernatePersistance.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.delete(employee);
		System.out.println("Deletion Successfull");
		session.getTransaction().commit();
		
		session.close();
		HibernatePersistance.shutdown();
	}

	public Employee get(int id) {
		
		Session session = HibernatePersistance.getSessionFactory().openSession();
		session.beginTransaction();
		
		Employee employee = (Employee) session.get(Employee.class, id);
		
		session.getTransaction().commit();
		
		session.close();
		HibernatePersistance.shutdown();
		
		return employee;
	}

	public List<Employee> getList() {
		
		return null;
	}
}
