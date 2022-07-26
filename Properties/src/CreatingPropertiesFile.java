import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class CreatingPropertiesFile {
   public static void main(String args[]) throws IOException {
      Properties props = new Properties();
      props.put("db.user", "arisglobal");
      props.put("db.password", "Aris123G$$gl@Bl");
      props.put("db.url", "www.google.com");
      String path = "D:\\config.properties";
      FileOutputStream outputStrem = new FileOutputStream(path);
      props.store(outputStrem,"");
      System.out.println("Properties file created......");
   }
}