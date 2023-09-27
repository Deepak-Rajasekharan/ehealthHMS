package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContext;
	public Hooks(TestContextSetup testContext) 
	{
		this.testContext = testContext;
	}
	
	public void loginToHMS(Scenario scenario) {
        // Add code to perform login to HMS
        // This code will run before each scenario in all features
    }
	
	@After
	public void AfterScenario() throws IOException
	{
		testContext.testBase.WebDriverManager().quit();
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{
		WebDriver driver = testContext.testBase.WebDriverManager();
		if(scenario.isFailed())
		{
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcepath);
			
			scenario.attach(fileContent, "image/png", "failedscreenshots");
		}
	}

}
