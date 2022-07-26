import java.util.*;

public class Program {

	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(System.in);
		HashMap<String, String> db = new HashMap<String, String>();
		db.put("user", "arisglobal");
		db.put("password", "password");
		db.put("url", "localhost");
		
		readPropertiesFile file = new readPropertiesFile();
		//file.createFile("config.properties");
		file.writeFile("config.properties", db);
		file.("config.properties", "user");
		
		
		
		
	}

}
