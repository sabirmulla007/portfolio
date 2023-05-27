package mavenproject1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erailecatering {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver m = new ChromeDriver();
		m.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(m, 20);
		m.manage().window().maximize();
		m.get("https://erail.in/");
		WebElement ecatering = m.findElement(By.xpath("//a[@href='https://www.ecatering.irctc.co.in/']"));
		String homewindow = m.getWindowHandle();
		ecatering.click();
		Set<String> allwindow = m.getWindowHandles();

		allwindow.remove(homewindow);
		Iterator<String> itr = allwindow.iterator();

		String child = itr.next();
		m.switchTo().window(child);
		WebElement searchtrain = m.findElement(By.xpath("//input[@placeholder='Search Train or Station to explore']"));
		// searchtrain.clear();
		// searchtrain.click();
		m.findElement(By.cssSelector(
				".flex-shrink-0.mb-6>.relative.w-full>.absolute.h-full.px-2.w-12.flex.items-center.justify-center"))
				.click();
		;
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search
		// Train or Station to explore']")));

		m.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")).click();
		m.findElement(By.xpath("//input[@placeholder='Start typing Nagpur, NGP, Rajdhani']")).sendKeys("12627");
		;
		// m.findElement(By.xpath("//input[@placeholder='Search Train or Station to
		// explore']")).sendKeys("12627");
		m.findElement(By.cssSelector(" .overflow-y-auto.h-full>div button")).click();

		w.until(ExpectedConditions.visibilityOf(m.findElement(By.cssSelector(" .overflow-y-auto.h-full>div button"))));

		m.findElement(By.xpath("//input[@placeholder=\"Boarding Date\"]")).click();
		;

		m.findElement(By.xpath("//input[@placeholder=\"Boarding Date\"]")).sendKeys(Keys.ENTER);

		m.findElement(By.cssSelector("body")).sendKeys(Keys.ENTER);
		Select a = new Select(m.findElement(By.xpath("//select[@placeholder='Boarding Station']")));
		w.until(ExpectedConditions
				.elementToBeClickable(m.findElement(By.xpath("//select[@placeholder='Boarding Station']"))));
		Thread.sleep(4000);
		m.findElement(By.cssSelector(".pl-12.appearance-none")).click();
		
		w.until(ExpectedConditions.visibilityOf(m.findElement(By.xpath("//option[text()='Boarding Station']"))));
		w.until(ExpectedConditions.elementToBeClickable	(m.findElement(By.xpath("//option[text()='Boarding Station']"))));
		Point P=m.findElement(By.xpath("//option[text()='Boarding Station']")).getLocation();
		
		Actions act=new Actions(m);
		act.moveToElement(m.findElement(By.xpath("//button[text()='FIND FOOD']")), 100, 0).click().build().perform();
		a.selectByVisibleText("Ksr Bengaluru - SBC");
		w.until(ExpectedConditions.visibilityOf(m.findElement(By.xpath("//button[text()='FIND FOOD']"))));
		m.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		List<WebElement> stations = m.findElements(
				By.cssSelector(".flex.flex-col>.shadow-md.bg-white.rounded.cursor-pointer.border-transparent"));
		System.out.println("no of stations is:" + stations.size());
		for (int i = 0; i < stations.size(); i++) {
			stations.get(i).click();
			try {
			List<WebElement> restraunt = m.findElements(By.cssSelector(".bg-white.flex.flex-wrap.cursor-pointer "));
			System.out.println("Restraunt count is " + restraunt.size());
			for (int j=1;j<=restraunt.size();j++) {
				restraunt.get(j-1);
			System.out.println(m
					.findElement(By.cssSelector(
							".bg-white.flex.flex-wrap.cursor-pointer:nth-of-type("+j+")>div:nth-of-type(2)>div:nth-of-type(1)>h5"))
					.getText());

		}}
			catch(NoSuchElementException e){
				System.out.println("no restraunt found");
			}

	}

}}
