package GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertySheet  {

	public static String emailid ;
	public static String password ;
	@Test
	public void data() throws IOException {
		
		FileInputStream fis = new FileInputStream("property//data.properties");
		Properties p = new Properties();
		  emailid = p.getProperty("email");
		  password = p.getProperty("password");
		  p.load(fis);
	}
}
