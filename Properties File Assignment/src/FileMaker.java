import java.io.*;
import java.util.*;
public class FileMaker {
private static FileMaker instance = null;
	
	private FileMaker() {
	}
	
	public static FileMaker getInstance() {
		if(instance == null)
			instance = new FileMaker();
		return instance;
	}
	public void createFile(String name) throws Exception {
		FileWriter fw = new FileWriter(name);
		fw.close();
	}
	
	public void writeFile(String name, HashMap<String, String> db) throws FileException {
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
	
	public void printFile(String name) throws IOException {
		FileReader fr;
		fr = new FileReader(name);
		int i;
		while((i = fr.read()) != -1)
			System.out.print((char)i);
		fr.close();
	}
}
