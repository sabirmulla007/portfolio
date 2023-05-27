package mavenproject1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.SeleniumUtility;

public class orangehrmActiveElement extends SeleniumUtility {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
setUp("chrome","https://opensource-demo.orangehrmlive.com/");
Thread.sleep(6000);
WebElement username=driver.switchTo().activeElement();

username.sendKeys("admin",Keys.TAB);
WebElement pwd=driver.switchTo().activeElement();
pwd.sendKeys("admin123",Keys.ENTER);





}

}
