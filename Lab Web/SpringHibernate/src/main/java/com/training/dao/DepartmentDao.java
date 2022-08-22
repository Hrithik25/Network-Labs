package com.training.dao;

import java.util.List;

import com.training.model.Department;

public interface DepartmentDao {
	public void saveDepartment(Department department);
    
    public List<Department> findAllDepartments();
     
    public void deleteDepartmentById(Integer id);
    
    public Department findById(Integer id);
     
    public void updateDepartment(Department department);
}
