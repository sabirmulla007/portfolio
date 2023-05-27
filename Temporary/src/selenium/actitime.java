package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitime {

	public static void main(String[] args) throws Throwable {
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
		
		m.get("https://demo.actitime.com/login.do");
		m.findElement(By.cssSelector("input#username")).sendKeys("admin");;
		m.findElement(By.cssSelector( "input.textField.pwdfield")).sendKeys("manager");
		m.findElement(By.cssSelector("a#loginButton")).click();
		m.findElement(By.cssSelector("div#container_tasks")).click();
		m.findElement(By.cssSelector(".title.ellipsis")).click();
		m.findElement(By.cssSelector(".item.createNewCustomer")).click();
        m.findElement(By.cssSelector(".inputFieldWithPlaceholder.newNameField")).sendKeys("$d%%$$$52455355454042054542115555555&   %%%");
		m.findElement(By.cssSelector(".inputFieldWithPlaceholder.newNameField")).sendKeys(Keys.PAGE_DOWN);
		m.findElement(By.cssSelector("#customerLightBox_content .commitButtonPlaceHolder .components_button_label")).click();
		//m.findElement(By.cssSelector("div#container_tasks")).click();
		Thread.sleep(2000);
		m.navigate().refresh();
		m.findElement(By.cssSelector(".title.ellipsis")).click();
		String k="javav";
		m.findElement(By.cssSelector("div[style='display: block; top: 129.5px; left: 329px;'] .item.createNewProject")).click();
		//m.findElement(By.cssSelector("div#container_tasks"));
		m.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("jaa");;
		m.findElement(By.id("ext-gen25")).click();;
		
		//m.findElement(By.id("ext-gen25")).click();
		
		m.findElement(By.cssSelector(".x-date-inner tr:nth-of-type(3) td:nth-of-type(2) .x-date-date")).click();
		Thread.sleep(2000);
		m.findElement(By.cssSelector(".projectNameField")).sendKeys(k);
		m.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button_label")).click();
		
		m.findElement(By.cssSelector(".taskRowsTable .selection .img")).click();
		m.findElement(By.cssSelector(".bulkOperationsPanel .delete")).click();
		Actions act=new Actions(m);
		WebElement c=m.findElement(By.xpath("//span[text()='Delete permanently']"));
		Thread.sleep(2000);
		q.until(ExpectedConditions.visibilityOf(c));
		q.until(ExpectedConditions.elementToBeClickable(c));
	
	act.moveToElement(c).click().perform();
		
	}

	
	}

	
	


