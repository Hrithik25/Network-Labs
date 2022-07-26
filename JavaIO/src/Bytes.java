import java.io.FileOutputStream;

public class Bytes {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("Output2.txt");
			String s = "Welcome to Banglore";
			byte[] b = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
