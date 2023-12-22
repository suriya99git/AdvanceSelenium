package GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public  ChromeDriver driver ;
   @BeforeClass
   public void openingBrowser() {
	   
	    driver = new ChromeDriver();
	   
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   }
   
   @AfterClass
   public void closingBrowser() {
	   
	   driver.quit();
   }

}
