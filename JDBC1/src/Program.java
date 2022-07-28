import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the jdbc driver
		Class.forName("org.postgresql.Driver");
		String jdbcUrl = "jdbc:postgresql://localhost:5432/lmsdb"; // lmsdb is db name
		String userName = "postgres";
		String userPassword = "Admin@123";
		
		// create the connection
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, userPassword);
		
		String insertSql = "insert into lms_users values(126, 'Deepak', 3);";
		
		// create sql statement
		Statement statement = connection.createStatement();
		// run executable
		statement.executeUpdate(insertSql);
		// close
		statement.close();
		connection.close();
		
		System.out.println("Connection Successful");
	}

}
