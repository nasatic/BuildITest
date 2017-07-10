package com.dttTests;

import org.junit.runner.RunWith;
import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@Parameters("browsers")
@CucumberOptions(features = "src/test/java/Feat/dttPOM.feature", glue = "StepDef", format = { "pretty", "html:target/html" })


public class dttPOMRunner extends AbstractTestNGCucumberTests {
}
