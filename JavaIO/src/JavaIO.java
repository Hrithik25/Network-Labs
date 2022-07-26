import java.io.*;

public class JavaIO {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("Output.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
