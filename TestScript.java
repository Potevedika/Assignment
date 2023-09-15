package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PomClasses.HomePage;
import PomClasses.LoginPage;
import libraryFiles.BaseClass;
import libraryFiles.UtilityClass;

public class TestScript extends BaseClass
{
	LoginPage login;
	 HomePage home;
	 WebDriver driver;
	 @BeforeClass
	 public void openBrowser() throws IOException
	 {
		 initializeBrowser();
		 login=new LoginPage(driver);
		 home=new HomePage(driver);
		 
	 }
	 @Test
	 public void TC01() throws IOException, InterruptedException
	 {
		 login.getemail(UtilityClass.readDataFromPF("email"));
		 login.getpass(UtilityClass.readDataFromPF("password"));
		 login.clickonButton();
		 
		 
		 Thread.sleep(2000);
		 
	 }
	 @Test
	 public void TC02()
	 {
	  String expresult="User not found";
	  String actresult = login.getText();
	  Assert.assertEquals(actresult,expresult,"Failed;both results are different");	 
	 }
	 @Test
   public void TC03()
   {
		 home.clickOnLogoutbutton();
   }
	 @AfterClass
	 public void closeBrowser()
	 {
		 driver.close();
	 }
}
