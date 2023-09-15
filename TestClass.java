package schoolwebapp;

public class TestClass 
{
 LoginPage login;
 HomePage home;
 @BeforeClass
 public void openBrowser()
 {
	 initializeBrowser();
	 login=new LoginPage(driver);
	 home=new HomePage(driver);
	 
 }
 @Test
 public void TC01()
 {
	 login.getemail(UtilityClass.readDataFromPF("email"));
	 login.getpass(UtilityClass.readDataFromPF("password");
	 login.clickonButton();
	 boolean actResult=home.
	 
	 Thread.sleep(2000);
	 
 }
 @Test
 public void TC02()
 {
	 
 }
}
