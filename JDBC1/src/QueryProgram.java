import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb";
		String userName = "postgres";
		String userPassword = "Admin@123";
		
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPassword);
		
		//System.out.println("Connection Successful");
		
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery("select * from lms_users");
		
		while(result.next()) {
			System.out.print(result.getInt("user_id") 
					+"\t" +result.getString("user_name") 
					+"\t" +result.getInt("role_id") +"\n");
		}
		
		result.close();
		statement.close();
		connection.close();
	}

}
