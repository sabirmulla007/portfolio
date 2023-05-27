package mavenproject1;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import utilities.SeleniumUtility;

public class NewTestng extends SeleniumUtility{
  @Test
  public void f() {
	  setUp("chrome"," https://opensource-demo.orangehrmlive.com/");
	 String ExpectedTitle="OrangeHRM";
	 String ActualTitle=getPageTitle();
	 Assert.assertEquals(ActualTitle, ExpectedTitle, "Login page Title not Verified ");
	 driver.findElement(By.name("username")).clear();
	 driver.findElement(By.name("username")) .sendKeys("admin");
	 
	 driver.findElement(By.name("password")).clear();
	 driver.findElement(By.name("password")).sendKeys("admin123");
	 driver.findElement(By.xpath( "//button[@type='submit']")).click();
	 String actualURL=driver.getCurrentUrl();
	 Assert.assertEquals(actualURL,"https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList","homeepage not found true ");
	  driver.close();
  }
}
