package com.training;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class DeptDao {
	NamedParameterJdbcTemplate template;  
	  
	public DeptDao(NamedParameterJdbcTemplate template) {  
	        this.template = template;  
	}
	
	public  void save (Department d){  
		String query="insert into department values (:dept_id,:dept_name,:dept_location)";  
		  
		Map<String,Object> map=new HashMap<String,Object>();  
		map.put("dept_id",d.getDept_id());  
		map.put("dept_name",d.getDept_name());  
		map.put("dept_location",d.getDept_location());
		template.execute(query,map,new PreparedStatementCallback() {  
			 
		    public Object doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        return ps.executeUpdate();  
		    }  
		});  
		}

}
