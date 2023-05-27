package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver m=new ChromeDriver();
		m.manage().window().maximize();
		
		m.get("https://erail.in/");
		
		System.out.println(m.getTitle());
		System.out.println(m.getCurrentUrl());
		System.out.println(m.getPageSource().length());
		System.out.println(m.getPageSource());
		List<WebElement> k=m.findElements(By.cssSelector("body>header>div>div>#mainnav"));
		for (int i=0;i<k.size();i++) {
		System.out.println(m.findElements(By.cssSelector("body>header>div>div>#mainnav")).get(i).getText());
	}

}}
