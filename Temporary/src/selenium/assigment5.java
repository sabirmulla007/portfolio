package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import mavenproject.Actions;
import mavenproject.WebDriverWait;

public class assigment5 {

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
		
		m.get("https://www.facebook.com/");
		
		System.out.println(m.getTitle());
		//System.out.println("validation expected title:" +m.getTitle().equalsIgnoreCase("Facebook – log in or sign up"));
		System.out.println(m.getCurrentUrl());
		//System.out.println("validation url" + m.getCurrentUrl().contains("https://www.facebook.com"));
		System.out.println(m.getPageSource().length());
		m.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		System.out.println(m.findElement(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(1)")).isDisplayed());
		m.findElement(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(1)")).sendKeys("12");
		m.findElement(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(3)")).sendKeys("2000");
		//m.findElement(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(3)")).sendKeys("2000").isSelected();
		
		WebElement c=m.findElement(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(1)"));
		
		System.out.println(c.isEnabled());
		System.out.println(c.isSelected());
		
		List<WebElement> r=m.findElements(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(1)"));
		System.out.println(r.size());
		
		WebElement p=m.findElement(By.cssSelector("select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(2)"));
		System.out.println(p.isSelected());
		//System.out.println(p.getText());
		//System.out.println(m.findElement(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(3)")).getText());
		//System.out.println(m.findElement(By.cssSelector("select[name='birthday_day']")).getText());
		System.out.println(m.findElements(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(1)")).size());
		System.out.println(m.findElements(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(2)")).size());
		System.out.println(m.findElements(By.cssSelector( "select[class='_9407 _5dba _9hk6 _8esg']:nth-of-type(3")).size());
		
		/*m.findElement(By.cssSelector("a[href='meizu-phones-74.php']")).click();
		//System.out.println(m.getPageSource());
		List<WebElement>q=m.findElements(By.cssSelector("div.makers a"));
	
		for (int i=0;i<q.size();i++) {
			
			System.out.println(q.get(i).getText());
		}
		System.out.println(q.size());*/
		/*m.close();}}public static  void main(String []args)throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver m=new ChromeDriver();
			m.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			m.get("https://www.globalsqa.com/demo-site/draganddrop/");
			m.manage().window().maximize();
			WebDriverWait w=new WebDriverWait(m,20);
			Actions a=new Actions (m);
			m.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
			System.out.println(w.until(ExpectedConditions.titleContains("Drag and Drop Demo Sites | Testing Site - GlobalSQA")));
			Thread.sleep(6000);
			WebElement c =m.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
			
			WebElement d =m.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
			
			w.until(ExpectedConditions.visibilityOf(c));
			w.until(ExpectedConditions.visibilityOf(d));
			w.until(ExpectedConditions.elementToBeClickable(c));
			w.until(ExpectedConditions.elementToBeClickable(d));
			a.dragAndDrop(c, d).build().perform();
			
			
		}
		}
*/