import java.io.*;

public class Input {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("Output.txt");
			int i = fin.read();
			System.out.println((char)i);
			fin.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
