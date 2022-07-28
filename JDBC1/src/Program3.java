import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Program3 {

	final static String SQL_INSERT = "insert into lms_users values(?, ?, ?);";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPassword = "Admin@123";
		
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPassword);
		
		PreparedStatement pstmt = connection.prepareStatement(SQL_INSERT);
		pstmt.setInt(1,127);
		pstmt.setString(2,"Lokesh");
		pstmt.setInt(3, 3);
		int row = pstmt.executeUpdate();
		
		Statement statement = connection.createStatement();
		
		
		ResultSet rs = statement.executeQuery("select * from lms_users;");
		while(rs.next()) {
			System.out.println(rs.getInt("user_id") +"\t" +rs.getString("user_name") +"\n");
		}
		
		pstmt.close();
		rs.close();
		statement.close();
		connection.close();

	}

}
