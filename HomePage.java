package schoolwebapp;

public class HomePage
{
	
	  @FindBy(xpath="//span[text()='Log Out']")private WebElement logout;
	  @FindBy(xpath="//button[text()='Ok']")private WebElement ok;
	  
	public  HomePage(WebDriver driver)

	{
		PageFactory.initElements(driver,this)  
		
	}
	public clickOnLogoutbutton()
	{
		logout.click();
	}
	public clickOnOkbutton()
	{
		ok.click();
	}
	}

}
