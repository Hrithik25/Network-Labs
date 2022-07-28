import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPassword = "Admin@123";
		
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPassword);
		
		Statement statement = connection.createStatement();
		
		String query = "update lms_users set user_name = 'Ravi Kumar' where user_id = 101;";
		
		statement.executeUpdate(query);
		
		ResultSet rs = statement.executeQuery("select * from lms_users where user_id = 101;");
		while(rs.next()) {
			System.out.println(rs.getInt("user_id") +"\t" +rs.getString("user_name"));
		}
		
		rs.close();
		statement.close();
		connection.close();

	}

}
