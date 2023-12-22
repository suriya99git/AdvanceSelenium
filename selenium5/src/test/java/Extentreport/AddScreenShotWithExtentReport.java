package Extentreport;

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddScreenShotWithExtentReport {

	@Test
	public void addScreenshot() {
		
		LocalDateTime l = LocalDateTime.now();
		
		String l1 = l.toString().replace(":","-");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 String shot = driver.getScreenshotAs(OutputType.BASE64);
		 
		 ExtentSparkReporter esp = new ExtentSparkReporter("ExtentReport//report1"+l1+".html");
		 
		 ExtentReports er = new ExtentReports();
		 
		 er.attachReporter(esp);
		 
		 ExtentTest test = er.createTest("AddScreenShotWithExtentReport");
		 
		 test.log(Status.INFO,"Sucessfully added screen shot");
		 
		 test.addScreenCaptureFromBase64String(shot);
		 
		 er.flush();
	}
}
