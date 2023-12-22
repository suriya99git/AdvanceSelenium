package Extentreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo {

	@Test
	public void extentReport() {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport//report.html");
		
		ExtentReports e = new ExtentReports();
		
		e.attachReporter(spark);
		
		ExtentTest test = e.createTest("Demo");
		
		
		test.log(Status.INFO, "added log status inside sucessfully");
		
		e.flush();
		
	}
}
