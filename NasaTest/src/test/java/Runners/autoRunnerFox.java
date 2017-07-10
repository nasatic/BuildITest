package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feat/autosite.feature", glue = "StepDefFOX",
                       format = { "pretty", "html:target/html" })
 

public class autoRunnerFox extends AbstractTestNGCucumberTests{

}
