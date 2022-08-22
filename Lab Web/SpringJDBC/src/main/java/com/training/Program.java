package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		DeptDao deptdao = (DeptDao) context.getBean("deptdao");
		DepartmentDao ddao = (DepartmentDao) context.getBean("ddao"); 
		
		Department department = new Department();
		department.setDept_id(107);
		department.setDept_name("HR");
		department.setDept_location("Banglore");
		
		deptdao.save(department);
		
		/*Department dept = new Department();
		dept.setDept_id(106);
		dept.setDept_name("Human Resource");
		dept.setDept_location("Bengaluru");
		
		int status = ddao.updateDepartment(dept);*/
		
		List<Department> list = ddao.getAllDepartments();
		
		for(Department d:list) 
			System.out.println(d);
		
		
		
		
	}

}
