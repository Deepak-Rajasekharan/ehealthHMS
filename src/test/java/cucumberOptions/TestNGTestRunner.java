/*Author - Deepak R Panicker*/


package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//html,json,xml,junit and extend reports can be downloaded
@CucumberOptions(features="src/test/java/features",tags="@QckRegn",glue="stepDefinitions"
,monochrome=true,dryRun=false,plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output/ExtentReport/Extent.html",
		"rerun:target/failed_scenarios.txt"})//,plugin= {"html:target/cucumber.html", "json:target/cucumber.json"},

public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
}
	
	/*
	@Override
	@DataProvider(parallel=true)//call the scenario method from parent class and set parallel to true to run all the requests parallel
	public Object[][] scenarios()
	{
		return super.scenarios();
	}*/


