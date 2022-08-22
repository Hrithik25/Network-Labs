package com.dao;
import java.sql.SQLException;

import com.entity.*;
public interface UserDao {
	public boolean isValidUser(User user) throws ClassNotFoundException, SQLException;
	public User getUser(String email,String pwd) throws ClassNotFoundException, SQLException;
}
