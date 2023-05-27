package mavenproject1;

 
 
import java.util.concurrent.TimeUnit;



import org.testng.Reporter;
import org.testng.annotations.Test;



import utilities.SeleniumUtility; 



public class NewTest12 extends SeleniumUtility {
  @Test
  public static void test() {
	  setUp("chrome","https://www.facebook.com/");
	

	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	  Reporter.log("Application Lauched successfully | ");
  }
}
