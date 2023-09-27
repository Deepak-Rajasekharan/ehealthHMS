package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.GenericUtils;

public class QuickRegistration {
	
	public WebDriver driver;
	public GenericUtils genericUtils;//new code
	public QuickRegistration (WebDriver driver)
	{
		this.driver = driver;
		this.genericUtils = new GenericUtils(driver);//new code
		
	}
	
	
	
	
	
	private By Rcptn = By.cssSelector("a[title='reception']");  //("//*[@id=\"mainIn\"]/form[1]/div[2]/ul/li[1]/a"); //css selector a[title='reception']
	private By QuickRegn = By.xpath("//a[@id='A2151']");
	private By PatName = By.xpath("//input[@id='pNameId']");
	private By Gndr = By.xpath("//select[@id='gender']");
	private By Age = By.xpath("//input[@id='age']");  //"//input[@id='age']"
	private By SC = By.xpath("//select[@id='deptId']");
	private By Submitclick = By.xpath("//input[@id='Submit11']");
	private By RegCheck = By.xpath("//input[@id='regCard']");
	
	
	
	public void Reception()
	{
		driver.findElement(Rcptn).click();
	}

public void QuickReg()
{
	driver.findElement(QuickRegn).click();
}


public void PatientName(String pname)
{
	String randomName =  genericUtils.generateRandomName();//new code
    driver.findElement(PatName).sendKeys(randomName);
	//driver.findElement(PatName).sendKeys(pname);
}

public void Gender(String gend)
{
	WebElement genderElement = driver.findElement(Gndr);
	genderElement.sendKeys(gend);
	
}

public void PatientAge(String pAge)
{
	driver.findElement(Age).sendKeys(pAge);
	
}
public void Department(String dept)
{
	WebElement deptElement = driver.findElement(SC);
	deptElement.sendKeys(dept);
}

public void Submit()
{
	driver.findElement(Submitclick).click();
}



public boolean QuickRegnCheck()
{
	
		return driver.findElement(RegCheck).isDisplayed();
	}


}
