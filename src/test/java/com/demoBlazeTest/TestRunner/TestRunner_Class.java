package com.demoBlazeTest.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.demoBlazeTest.Utility.Base_Parent;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/AllFeature"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition",tags = {"@Test2"})
public class TestRunner_Class extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void startURL() {
		Base_Parent base = new Base_Parent();
		base.browserSetup();
	}
	
	@AfterTest
	public void closeURL( ) {
		Base_Parent base = new Base_Parent();
		base.driver.quit();
	}
}
