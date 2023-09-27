package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.QuickRegistration;
import utils.TestContextSetup;

public class QuickRegStepDefinition {
	public WebDriver driver;
	TestContextSetup testContext;
	public LoginPageObjects loginPageObjects;
	public HomePageObjects homePageObjects;
	public QuickRegistration quickRegistration;
	

	
	//Dependency injection //Single responsibility principle //loosely coupled //Factory design Pattern
	public  QuickRegStepDefinition(TestContextSetup testContext)
	{
		this.testContext= testContext;
		this.quickRegistration = testContext.pageObjectManager.getquickRegdn();
	}
	



@Given("Click on Reception and Quick Registration")
public void click_on_reception_and_quick_registration() throws InterruptedException {
	
	
	quickRegistration.Reception();
	
	quickRegistration.QuickReg();
	
    
}
@Then("Fill the patient name")
public void fill_the_patient_name() throws InterruptedException {
	String patientName = testContext.genericUtils.generateRandomName();
    quickRegistration.PatientName(patientName);
	
	
}
@When("Select {string}")
public void select_gender(String gender) throws InterruptedException {
	
	quickRegistration.Gender(gender);
    Thread.sleep(1000);
}
@When("^Enter (.+)$") 
public void enter_age(String pAge) throws InterruptedException {
	
	quickRegistration.PatientAge(pAge);
	Thread.sleep(1000);
	
}
@When("Choose {string}")
public void choose_dept(String department)
{
	
	quickRegistration.Department(department);
}


	

@When("Click Submit")
public void click_submit() {
	
	quickRegistration.Submit();
	
}
@Then("Success message will be displayed")
public void success_message_will_be_displayed() {
	
	
	
		Assert.assertTrue(quickRegistration.QuickRegnCheck());
	
}




}
