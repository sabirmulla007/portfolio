package mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.SeleniumUtility;

public class stepdefinitionGoogleSearch extends SeleniumUtility {

@Given("^User is already on google search page$")
public void user_is_already_on_google_search_page()  {
	setUp("chrome", "https://www.google.com");
}

@When("^user types (.+) in search input field and presses enter key$")
public void user_types_something_in_search_input_field_and_presses_enter_key(String Texttobesearched)  {
	
    
      WebElement Element=driver.findElement((By.name("q")));
      Element.sendKeys(Texttobesearched,Keys.ENTER);
}
@Then("^user should be able to get result page with title having (.+)$")
public void user_should_be_able_to_get_result_page_with_title_having(String name)  {
	
	 Assert.assertTrue(driver.getTitle().contains(name));
}
@When("^User types (.+) on google search page and presses enter$")
public void user_types_on_google_search_page_and_presses_enter(String Texttobesearched)  {
	
   
      WebElement Element=driver.findElement((By.name("q")));
      Element.sendKeys(Texttobesearched,Keys.ENTER);
}

@Then("^User should be able to get result page with title having (.+)$")
public void User_should_be_able_to_get_result_page_with_title_having(String Texttobesearched)  {
	
	 Assert.assertTrue(driver.getTitle().contains(Texttobesearched));
}

}
