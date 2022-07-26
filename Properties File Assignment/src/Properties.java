import java.io.*;
import java.util.*;
public class Properties {
	private static Properties instance = null;
	//private HashMap<String, String> db = new HashMap<String, String>();
	private Properties() {
	}
	
	public static Properties getInstance() {
		if(instance == null)
			instance = new Properties();
		return instance;
	}
	
	/*public void createFile(String name) throws Exception {
		FileWriter fw = new FileWriter(name);
		fw.close();
	}*/
	
	
	public void writeFile(String name, HashMap<String, String> db) throws FileException {
		//this.db = db;
		if(db.size() > 3)
			throw new FileException("Invalid Data");
		else if(db.get("user") != "arisglobal")
			throw new FileException("Incorrect Username");
		else if(db.get("password") != "password")
			throw new FileException("Incorrect Password");
		else if(db.get("url") != "localhost")
			throw new FileException("Incorrect url");
		else {
			try {
				FileWriter fw = new FileWriter(name);
					db.forEach((k, v) 
						-> {
							try {
								fw.write(k +"=" +v +"\n");
							} catch (IOException e) {
								
								e.printStackTrace();
							}
						});
				fw.close();
				System.out.println("Success");
			}
			catch (Exception e) {
				throw new FileException("e");
			}
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public String getMessage(String name, String key) {
		String value = "";
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(name));
			HashMap<String, String> db = (HashMap<String, String>)in.readObject();
			in.close();
			value = db.get(key);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
