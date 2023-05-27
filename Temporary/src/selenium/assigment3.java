package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assigment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver m=new ChromeDriver();
		m.manage().window().maximize();
		m.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		m.get("https://www.espncricinfo.com/");
		
		System.out.println(m.getTitle());
		//System.out.println("validation expected title:" +m.getTitle().equalsIgnoreCase("Facebook � log in or sign up"));
		System.out.println(m.getCurrentUrl());
		//System.out.println("validation url" + m.getCurrentUrl().contains("https://www.facebook.com"));
		System.out.println(m.getPageSource().length());
		//System.out.println(m.getPageSource());
		List<WebElement>q=m.findElements(By.cssSelector("#main-container >div:nth-of-type(3) .ds-flex.ds-flex-row:nth-of-type(1) div.ds-flex.ds-flex-row>div>a"));
		for (int i=0;i<q.size();i++) {
			
			System.out.println(q.get(i).getText());
			//div[class='ds-fle4x ds-flex-row']>div>a
		}
		/*m.close();*/}}




