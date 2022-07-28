import java.io.*;
public class FileCreater {

	public static void main(String[] args) throws IOException {
		try {
			FileWriter fw = new FileWriter("details.csv");
			fw.write("hello,say|babye;what,saying|,wow;");
			System.out.println("Success");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader("details.csv");
			int i;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
