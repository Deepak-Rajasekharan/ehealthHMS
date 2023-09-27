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
import pageObjects.LoginPageObjects;
import utils.TestContextSetup;

public class LoginStepDefinition {
	public WebDriver driver;
	TestContextSetup testContext;
	//Dependency injection //Single responsibility principle //loosely coupled //Factory design Pattern
	public  LoginStepDefinition(TestContextSetup testContext)
	{
		this.testContext= testContext;
	}

@Given("User is on HMS login Page")
public void user_is_on_hms_login_page() {
	
}
@When("^User give (.+) and (.+)$")
public void user_give_and(String loginName, String password) throws InterruptedException {
	
	LoginPageObjects loginPageObjects = testContext.pageObjectManager.getLoginPage();
	loginPageObjects.loginUser(loginName);
	loginPageObjects.Password(password);
	loginPageObjects.formClick();
	
	Thread.sleep(1000);
	
	
}


@When("select {string} and {string}")
public void select_and(String hospital, String sc) throws InterruptedException {
	
	
	LoginPageObjects loginPageObjects = testContext.pageObjectManager.getLoginPage();
	loginPageObjects.hospitalName(hospital);
	loginPageObjects.formClick();
    
	Thread.sleep(1000);
	
	loginPageObjects.ServiceCenter(sc);
	
}

@When("click Signin")
public void select_signin() throws InterruptedException {
	
	LoginPageObjects loginPageObjects = testContext.pageObjectManager.getLoginPage();
	loginPageObjects.signInClick();
    Thread.sleep(1000);
    
    testContext.genericUtils.acceptAlertIfPresent();
    
    Thread.sleep(1000);
    
}



@When("Ignore Last Login")
public void ignore_last_login() {
	
	LoginPageObjects loginPageObjects = testContext.pageObjectManager.getLoginPage();
	
	testContext.genericUtils.SwitchChildWindow();
	loginPageObjects.ignoreLastLogin();
	
	
}


}
