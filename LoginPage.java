package schoolwebapp;

public class LoginPage
{    
	 @FindBy(xpath="//img[@alt='Facegenie-logo']")private WebElement eml;
	 @FindBy(xpath="//input[@name='email']")private WebElement eml;
	  @FindBy(xpath="//input[@id='password']")private WebElement pwd;
	  @FindBy(xpath="//button[text()='Log In']")private WebElement login;
	  
	public  LoginPage(WebDriver driver)

	{
		PageFactory.initElements(driver,this)  
		
	}
	public boolean verifyLogo()
	{
		boolean result=logo.isDisplayed();
		return result;
	}
	public void getemail(String email)
	{
		eml.sendKeys(email);
	}
	public void getpass(String pass)
	{
		pwd.sendKeys(pass);
	}
	public clickonButton()
	{
		login.click();
	}
}
