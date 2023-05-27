package mavenproject1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expText = "Redmi note 10";

		WebElement search = driver
				.findElement(By.xpath("html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		Actions actions = new Actions(driver);
		actions.moveToElement(search).sendKeys("redmi ").build().perform();
		// search.sendKeys(" redmi");
		Thread.sleep(2000);
		List<WebElement> MultipleElements = driver.findElements(By.xpath(
				"html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]/div[1]/span"));
		for (WebElement singLeElement : MultipleElements) {
			String actText = singLeElement.getText();
			if (actText.equalsIgnoreCase(expText)) {
				singLeElement.click();
				break;
			}
		}
	}
}
