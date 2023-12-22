package DemoWebshop;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import GenericLibrary.ExcelSheet;
import pom_script.*;

public class TC_001Test extends BaseTest {

	@Test(dataProvider ="exceldata" )
	public void test(String firstname,String lastname,String emailid,String password,String confpassword)
	{
	
        WelcomePage w = new WelcomePage(driver);
		
		w.getRegisterbutton().click();
		
		RegisterPage r = new RegisterPage(driver);
		r.getGender().click();
		r.getFirstname().sendKeys(firstname);
		r.getLastname().sendKeys(lastname);
		r.getEmailid().sendKeys(emailid);
		r.getPassword().sendKeys(password);
		r.getConfpassword().sendKeys(confpassword);
		r.getRegisterbutton().click();
	}
	
	@DataProvider(name = "exceldata")
	public Object[][]data() throws EncryptedDocumentException, IOException{
		return  ExcelSheet.excelData();
	}
	
}
