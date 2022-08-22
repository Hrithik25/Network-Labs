package com.training;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class DepartmentDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveDepartment(Department d){  
		//    String query="insert into department values('"+e.getId()+"','"+e.getDept_name()+"','"+e.getLocation()+"')";  
		    String query="insert into department values('"+d.getDept_id()+"','"+
		    		d.getDept_name()+"','"+d.getDept_location()+"')";  

			return jdbcTemplate.update(query);  
		}
	public int updateDepartment(Department d) {
		String query = "update department set dept_name='" +d.getDept_name() +"', dept_location='" +d.getDept_location() +
				"' where dept_id=" +d.getDept_id();
		return jdbcTemplate.update(query);
	}
	
	public List<Department> getAllDepartments(){  
		 return jdbcTemplate.query("select * from department",
				 new ResultSetExtractor<List<Department>>(){  
		     public List<Department> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Department> list=new ArrayList<Department>();  
		        while(rs.next()){  
			        Department d=new Department();  
			        d.setDept_id(rs.getInt(1));  
			        d.setDept_name(rs.getString(2));
			        d.setDept_location(rs.getString(3));
			        list.add(d);  
		        }  
		        return list;  
		        }  
		    });  
		  }
	public List<Department> getAllDepartmentsRowMapper() {
		return jdbcTemplate.query("select * from department", new RowMapper<Department>() {
			public Department mapRow(ResultSet rs, int rownumber) throws SQLException {
				Department d = new Department();
				d.setDept_id(rs.getInt(1));
				d.setDept_name(rs.getString(2));
				d.setDept_location(rs.getString(3));
				return d;
			}
		});
	}
}

