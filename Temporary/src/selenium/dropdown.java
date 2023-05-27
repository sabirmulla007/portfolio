package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
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
		m.get("http://demo.automationtesting.in/Register.html");
		
		Select c=new Select(m.findElement(By.id("Skills")));
		System.out.println(c.getFirstSelectedOption().getText());
		for (int i=0;i<c.getOptions().size();i++) {
			
			System.out.print(c.getOptions().get(i).getText());}
		List<WebElement> actual=c.getOptions().;
		System.out.println();
		System.out.println(actual);
			String exepcted="Select SkillsAdobe InDesignAdobe PhotoshopAnalyticsAndroidAPIsArt DesignAutoCADBackup ManagementCC++CertificationsClient ServerClient SupportConfigurationContent ManagmentContent Management Systems (CMS)Corel DrawCorel Word PerfectCSSData AnalyticsDesktop PublishingDesignDiagnosticsDocumentationEnd User SupportEmailEngineeringExcelFileMaker ProFortranHTMLImplementationInstallationInternetiOSiPhoneLinuxJavaJavascriptMacMatlabMayaMicrosoft ExcelMicrosoft OfficeMicrosoft OutlookMicrosoft PublisherMicrosoft WordMicrosoft VisualMobileMySQLNetworksOpen Source SoftwareOraclePerlPHPPresentationsProcessingProgrammingPT ModelerPythonQuickBooksRubyShadeSoftwareSpreadsheetSQLSupportSystems AdministrationTech SupportTroubleshootingUnixUI / UXWeb Page DesignWindowsWord ProcessingXMLXHTML";
		System.out.println(actual.toString().equals(exepcted.toString()));
		}
	}


