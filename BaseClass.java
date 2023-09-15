package schoolwebapp;

public class BaseClass 
{
WebDriver driver;
	
	public void initializeBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\hp\\Downloads\\chromedriver_win32");                    
	     driver=new ChromeDriver();
		driver.get(UtilityClass.readDataFromPF("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	}

}
}
