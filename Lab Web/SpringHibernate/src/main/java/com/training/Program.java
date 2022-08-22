package com.training;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Department;
import com.training.service.DepartmentService;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DepartmentService departmentService = (DepartmentService) context.getBean("departmentService");

		Department department = new Department();
		department.setDept_id(109);
		department.setDept_name("Operations");
		department.setDept_location("Mumbai");

		departmentService.saveDepartment(department);

		List<Department> list = departmentService.findAllDepartments();

		for (Department d : list)
			System.out.println(d);
	}

}
