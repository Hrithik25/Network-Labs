package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.dao.DepartmentDao;
import com.training.model.Department;

@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDao departmentDao;
	
	public void saveDepartment(Department department) {
		departmentDao.saveDepartment(department);
	}

	public List<Department> findAllDepartments() {
		return departmentDao.findAllDepartments();
	}

	public void deleteDepartmentById(Integer id) {
		departmentDao.deleteDepartmentById(id);
	}

	public Department findById(Integer id) {
		return departmentDao.findById(id);
	}

	public void updateDepartment(Department department) {
		departmentDao.updateDepartment(department);
	}

}
