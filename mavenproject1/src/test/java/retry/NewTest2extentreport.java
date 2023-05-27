package retry;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.SeleniumUtility;

import java.io.File;
import java.io.IOException;



public class NewTest2extentreport  extends SeleniumUtility {
	static ExtentReports report;
	static ExtentTest test;
  @Test
  public void f() throws IOException {
setUp("chrome","https://www.google.com");

	report =new ExtentReports(".\\extentreport\\Extentreport.html");
	if (getPageTitle().equals("Google")) {
		test.log(LogStatus.PASS,test.addScreenCapture(screenShot(driver)), "Navigated to the specified URL successfully and page tile is also validated");
	}
	
	Assert.assertTrue(true);
	
	
	

	  
	  
	  
	  
	  
	  
  }
  
	  public static String screenShot(WebDriver driver) throws IOException {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File Dest = new File(".src//BStackImages//ExtentReport1" + System.currentTimeMillis()+ ".png");
			String errflpath = Dest.getAbsolutePath();
			FileUtils.copyFile(scrFile, Dest);
			return errflpath;
			}
  }
  


