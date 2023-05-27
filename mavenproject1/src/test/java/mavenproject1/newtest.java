package mavenproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtest {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver m=new ChromeDriver();
m.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebDriverWait w= new WebDriverWait(m,20);
m.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
Thread.sleep(10000);
m.switchTo().frame(m.findElement(By.xpath("//frame[@src='htmlf.htm']']")));
m.findElement(By.xpath("//frame[@src='htmlf.htm']")).click();;
m.switchTo().defaultContent();

	}

}
