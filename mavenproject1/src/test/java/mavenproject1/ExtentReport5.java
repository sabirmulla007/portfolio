package mavenproject1;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.AfterMethod;

public class ExtentReport5 extends SeleniumUtility {
	 @BeforeMethod
	  public void beforeMethod() {
	 
	 }
  @Test(expectedExceptions=ArithmeticException.class)
  public void f() {
  }
 public void some() {
	 int j=10/0;
	 System.out.println(j);
 }

  @AfterMethod
  public void afterMethod() {
  }

}
