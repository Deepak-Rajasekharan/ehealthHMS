package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
	public WebDriver driver;
	public HomePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By Logincheck = By.xpath("//*[@id=\"scDivId\"]");
	private By Homeclick = By.xpath("//a[@title='Home']");



public boolean isLoggedin()
{
	return driver.findElement(Logincheck).isDisplayed();
}
public void Home()
{
	driver.findElement(Homeclick).click();
}

}