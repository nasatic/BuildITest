package com.dttTests;

import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Parameters("browsers")
//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feat/dtt.feature", glue = "StepDef", format = { "pretty", "html:target/html" })

public class dttRun extends AbstractTestNGCucumberTests{

}
