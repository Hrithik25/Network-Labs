package com.daoImpl;
import com.dao.*;
import com.entity.*;
import java.sql.*;
public class UserDaoImpl implements UserDao {

	@Override
	public boolean isValidUser(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String query = "Select * from lms_users where user_email=?";
		Class.forName("org.postgresql.Driver");
		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPwd = "Admin@123";
		Connection connect = DriverManager.getConnection(jdbcUrl,userName,userPwd);
		PreparedStatement pstmt = connect.prepareStatement(query);
		pstmt.setString(1, user.getUserEmail());
		ResultSet res= pstmt.executeQuery();
		while(res.next())
		{
			if(res.getString("user_email") == user.getUserEmail())
			{
				if(res.getString("user_password") == user.getUserPwd())
					return true;
			}
		}
		return false;
	}

	@Override
	public User getUser(String email, String pwd) throws ClassNotFoundException, SQLException {
		String query = "Select * from lms_users where user_email=?";
		Class.forName("org.postgresql.Driver");
		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPwd = "Admin@123";
		Connection connect = DriverManager.getConnection(jdbcUrl,userName,userPwd);
		PreparedStatement pstmt = connect.prepareStatement(query);
		pstmt.setString(1, email);
		ResultSet res = pstmt.executeQuery();
		User user = new User();
		while(res.next())
		{
			user.setUser_id(res.getInt("id"));
			user.setUserFirstName(res.getString("firstname"));
		}
		pstmt.close();
		connect.close();
		return user;
		
	}
	
}
