package com.dttTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/StepDef/dttTest2.feature", format = { "pretty", "html:target/html" })

public class dttTest2Runner {

}
