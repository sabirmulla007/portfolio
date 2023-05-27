package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipcartmhoveroverelement  {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver m=new ChromeDriver();
		m.manage().window().maximize();
		WebDriverWait q=new WebDriverWait(m,20);
		m.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		m.get("https://www.flipkart.com/");
		m.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		Actions act=new Actions(m);
		List<WebElement>d=m.findElements(By.xpath("//div[@class='_37M3Pb']/div/a"));
		for (int i=0;i<d.size();i++) {
			act.moveToElement(d.get(i)).perform();;
			Thread.sleep(1500);
			
		}
		
		
	}

}
