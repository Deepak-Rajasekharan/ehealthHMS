package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPageObjects {
	
	public WebDriver driver;
	public LoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	private By Login = By.id("loginName");
	private By password = By.id("password");
	private By formclick = By.name("loginForm");
	private By hospital = By.xpath("//*[@id=\"hospital\"]");
	private By ServiceCentre = By.xpath("//*[@id=\"department\"]");
	private By SignIn = By.xpath("//*[@id=\"login\"]/input[3]");
	private By IgnoreLastLogin = By.xpath("/html/body/form/div[5]/input[1]");
	private By WrngPword = By.xpath("//div[@id='responseList']");



public void loginUser(String login)
{
	driver.findElement(Login).sendKeys(login);
}


public void Password(String pword)
{
	driver.findElement(password).sendKeys(pword);
}

public void formClick()
{
	driver.findElement(formclick).click();
}

public void WrngPass() 
{
	driver.findElement(WrngPword);
}

public void hospitalName(String hospitals)
{
	WebElement hospitalElement = driver.findElement(hospital);
	hospitalElement.sendKeys(hospitals);
	
}

public void ServiceCenter(String sc)
{
	WebElement SCElement = driver.findElement(ServiceCentre);
	SCElement.sendKeys(sc);
	
}

public void signInClick()
{
	driver.findElement(SignIn).click();
}

public void ignoreLastLogin()
{
	driver.findElement(IgnoreLastLogin).click();
}

}
