package com.training.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.training.model.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends AbstractDao implements DepartmentDao {

	public void saveDepartment(Department department) {
		super.persist(department);
	}

	public List<Department> findAllDepartments() {
		Criteria criteria = getSession().createCriteria(Department.class);
		return (List<Department>) criteria.list();
	}

	public void deleteDepartmentById(Integer id) {
		Query query = getSession().createSQLQuery("delete from department where dept_id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	public Department findById(Integer id) {
		Criteria criteria = getSession().createCriteria(Department.class);
		criteria.add(Restrictions.eq("dept_id", id));
		return (Department) criteria.uniqueResult();
	}

	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub

	}

}
