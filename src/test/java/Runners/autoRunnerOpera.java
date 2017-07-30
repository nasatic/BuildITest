package Runners;

import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
//@Parameters("browsers")
@CucumberOptions(features = "src/test/java/Feat/autosite.feature", glue = "StepDefOPERA",
                       format = { "pretty", "html:target/html" })


public class autoRunnerOpera extends AbstractTestNGCucumberTests {

}
