package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class HomeStepDefinition {
	public WebDriver driver;
	TestContextSetup testContext;
	PageObjectManager pageObjectManager;
	
	//Dependency injection //Single responsibility principle //loosely coupled //Factory design Pattern

	public HomeStepDefinition(TestContextSetup testContext)
	{
	this.testContext=testContext;
	}



@Then("User will be redirected to HomePage")
public void user_will_be_redirected_to_home_page() throws InterruptedException {
	
	HomePageObjects homePageObjects =testContext.pageObjectManager.gethomePage();
	
	
	
	 
	testContext.genericUtils.SwitchParentWindow();
	
	
	
	Boolean Display = homePageObjects.isLoggedin();
	
	
	System.out.println("Home page  :"+Display);
	
	
	
}

}
