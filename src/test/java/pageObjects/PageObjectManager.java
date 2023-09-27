package pageObjects;

import org.openqa.selenium.WebDriver;



public class PageObjectManager {
	
	public LoginPageObjects loginPageObjects;
	public HomePageObjects homePageObjects;
	public QuickRegistration quickRegistration;
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPageObjects getLoginPage()
	{
		loginPageObjects = new LoginPageObjects(driver);
		return loginPageObjects;
	}
	
	public HomePageObjects gethomePage()
	{
		homePageObjects = new HomePageObjects(driver);
		return homePageObjects;
	}
	
	public QuickRegistration getquickRegdn()
	{
		quickRegistration = new QuickRegistration(driver);
		return quickRegistration;
	}

}
