package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.gson.annotations.Until;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.VtigerHomePage;
import webpages.VtigerLoginPage;




public class Vtigercontactcreation extends SeleniumUtility {
VtigerHomePage homePage;
VtigerLoginPage loginPage;

	@Given("^i am on chrome browser$")
	public void i_am_on_chrome_browser() {
		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");

	}

	@When("^I i logged in the website using valid vredentials$")
	public void i_i_logged_in_the_website_using_valid_vredentials() {
		WebElement Id = driver.findElement(By.id("username"));
		Id.clear();
		Id.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	}

	@Then("^I validate if contact is deleted or not$")
	public void i_validate_if_contact_is_deleted_or_not()throws InterruptedException  {
		VtigerHomePage homePage =new VtigerHomePage(driver);
		
		
		homePage.navigateToContactsPage();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[2]/a/span[2]")).click();
		//driver.findElement(By.cssSelector(".btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();
		
		try {//driver.findElement(By.cssSelector(".listViewEntriesMainCheckBox")).click();
		//driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		//driver.findElement(By.xpath("//button[text()='Yes']")).click();
			Assert.assertEquals(driver.findElement(By.cssSelector("#listview-table>tbody>tr")).getAttribute("class"), "emptyRecordsDiv", "Contact not deleted");
			
		} finally {driver.findElement(By.cssSelector(".userName.dropdown-toggle.pull-right>span:nth-of-type(1)")).click();
		 driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
			// TODO: handle finally clause
		}

	}

	@And("^I Click on 3 dots go to marketing and go to contact button click on create contact button and create contact using (.+), (.+) and (.+)$")
	public void i_click_on_3_dots(String name, String surname,
			String mobileno)  {
		driver.findElement(By.cssSelector("#appnavigator>.row.app-navigator")).click();
		driver.findElement(By.cssSelector("#MARKETING_modules_dropdownMenu>.menu-items-wrapper.app-menu-items-wrapper"))
		.click();;
		driver.findElement(By.xpath("//span[text()=' Contacts']"))
		.click();
//driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[2]/a/span[2]")).click();
//new WebDriverWait(driver,60).until(ExpectedConditions.invisibilityOfElementLocated(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")));
//waitTillElementIsClickable(driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")));


//driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
WebElement m = driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD"));
JavascriptExecutor jse = (JavascriptExecutor) driver;
jse.executeScript("arguments[0].click();", m);
driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys(name);
driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys(surname);
driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys(mobileno);
driver.findElement(By.cssSelector(".btn.btn-success.saveButton")).click();

	}

	

	@And("^after that delete that contact$")
	public void after_that_delete_that_contact() {
		driver.findElement(By.cssSelector("#appnavigator>.row.app-navigator")).click();
		driver.findElement(By.cssSelector(".menu-items-wrapper.app-menu-items-wrapper")).click();
		driver.findElement(By.xpath("//span[text()=' Contacts']"))
				.click();
		//driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[2]/a/span[2]")).click();
		driver.findElement(By.cssSelector(".listViewEntriesMainCheckBox")).click();
		driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		//WebElement m= driver.findElement(By.cssSelector("btn.confirm-box-ok.confirm-box-btn-pad.btn-primary"));
		///JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		//jsExecutor.executeScript("Argument[0].click", m);
		
		/*driver.findElement(By.cssSelector(".listViewEntriesCheckBox")).click();
		driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		driver.findElement(By.cssSelector("btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();*/
		
		
	}
	@And("^after that delete that contact2$")
	public void after_that_delete_that_contact2() {
		driver.findElement(By.cssSelector("#appnavigator>.row.app-navigator")).click();
		driver.findElement(By.cssSelector(".menu-items-wrapper.app-menu-items-wrapper")).click();
		driver.findElement(By.xpath("//span[text()=' Contacts']"))
				.click();
		//driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[2]/a/span[2]")).click();
		driver.findElement(By.cssSelector(".listViewEntriesMainCheckBox")).click();
		driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		//WebElement m= driver.findElement(By.cssSelector("btn.confirm-box-ok.confirm-box-btn-pad.btn-primary"));
		///JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		//jsExecutor.executeScript("Argument[0].click", m);
		
		/*driver.findElement(By.cssSelector(".listViewEntriesCheckBox")).click();
		driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		driver.findElement(By.cssSelector("btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();*/
		
		
	}
	@Then("^I validate if contact is deleted or not2$")
	public void i_validate_if_contact_is_deleted_or_not2()throws InterruptedException  {
		VtigerHomePage homePage =new VtigerHomePage(driver);
		
		
		homePage.navigateToContactsPage();
		//Thread.sleep(6000);
		//driver.findElement(By.xpath("//*[@id=\"mCSB_1_container\"]/li[2]/a/span[2]")).click();
		//driver.findElement(By.cssSelector(".btn.confirm-box-ok.confirm-box-btn-pad.btn-primary")).click();
		
		try {//driver.findElement(By.cssSelector(".listViewEntriesMainCheckBox")).click();
		//driver.findElement(By.id("Contacts_listView_massAction_LBL_DELETE")).click();
		//driver.findElement(By.xpath("//button[text()='Yes']")).click();
			Assert.assertEquals(driver.findElement(By.cssSelector("#listview-table>tbody>tr")).getAttribute("class"), "emptyRecordsDiv", "Contact not deleted");
			
		} finally {driver.findElement(By.cssSelector(".userName.dropdown-toggle.pull-right>span:nth-of-type(1)")).click();
		 driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
			// TODO: handle finally clause
		}

	}
}