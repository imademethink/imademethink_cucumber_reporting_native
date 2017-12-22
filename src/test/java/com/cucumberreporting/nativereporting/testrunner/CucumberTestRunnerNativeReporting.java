package com.cucumberreporting.nativereporting.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features 			= {"src/test/resources"},
		format 			= {
									"pretty", 
									"json:target/json/testreport.json", 
									"html:target/html/native-cucumber-reporting.html",
               						"junit:target/junit/testreport.xml"
									},
		glue 	 			= {"com.cucumberreporting.nativereporting.stepDefinition"},
		tags	 				= {"@all"},
		dryRun 	 		= false,
		strict 	 			= false,
		monochrome = true
)

public class CucumberTestRunnerNativeReporting {
	
}
