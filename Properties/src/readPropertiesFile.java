import java.io.*;
import java.util.*;
public class readPropertiesFile {
   public static void main(String args[]) throws IOException {
      Properties prop = readPropertiesFile("D:\\config.properties");
      System.out.println("db.user: "+ prop.getProperty("db.user"));
      System.out.println("db.password: "+ prop.getProperty("db.password"));
      System.out.println("db.url: "+ prop.getProperty("db.url"));
   }
   public static Properties readPropertiesFile(String fileName) throws IOException {
      FileInputStream fis = null;
      Properties prop = null;
      try {
         fis = new FileInputStream(fileName);
         prop = new Properties();
         prop.load(fis);
      } catch(FileNotFoundException fnfe) {
         fnfe.printStackTrace();
      } catch(IOException ioe) {
         ioe.printStackTrace();
      } finally {
         fis.close();
      }
      return prop;
   }
}