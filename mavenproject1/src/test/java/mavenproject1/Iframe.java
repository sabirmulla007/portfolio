package mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Iframe extends SeleniumUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             setUp("chrome","https://jqueryui.com/");
             
             WebElement Droppable =driver.findElement(By.xpath("//a[text()='Droppable']"));
             Droppable.click();
             driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
           WebElement Draggable=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
           
             WebElement Dropable=driver.findElement(By.id("droppable"));
Actions act=new Actions (driver);
act.moveToElement(Draggable).dragAndDrop(Draggable,Dropable).build().perform();
//src=
//dest=
//act.draggable.dragAndDrop()

	}

}
