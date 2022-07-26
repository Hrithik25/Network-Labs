import java.util.*;

public class Program {

	public static void main(String[] args) throws Exception {
		HashMap<String, String> db = new HashMap<String, String>();
		db.put("user", "arisglobal");
		db.put("password", "password");
		db.put("url", "localhost");
		
		FileMaker file = FileMaker.getInstance();
		file.createFile("config.properties");
		file.writeFile("config.properties", db);
		file.printFile("config.properties");
		
		
		
		
	}

}
