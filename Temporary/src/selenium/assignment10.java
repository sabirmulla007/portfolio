package selenium;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver m=new ChromeDriver();
		m.get("https://www.gsmarena.com");
		m.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		m.findElement(By.cssSelector(".brandmenu-v2>ul a[href='realme-phones-118.php']")).click();
		try{
			m.findElement(By.cssSelector(".review-nav  .nav-pages>a:nth-of-type(2)")).click();
			System.out.println("the page has  paginitiation");
			
			List<WebElement> p=m.findElements(By.cssSelector(".review-nav  .nav-pages>a"));
			
			for(int i=0;i<p.size();i++) {
				System.out.println(p.get(i).getAttribute("href"));
			
			
		}}
		catch(NoSuchElementException e) {
			m.findElement(By.cssSelector(".review-nav  .nav-pages>a:nth-of-type(2)")).click();
			System.out.println("the page has not paginitiation");
				
			}
			
			
		
	}

}
