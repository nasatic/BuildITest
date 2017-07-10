package Runners;
import org.testng.annotations.Parameters;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@Parameters("browsers")
@CucumberOptions(features = "src/test/java/Feat/autosite.feature", glue = "StepDefCH",
                 format = { "pretty", "html:target/html" })


public class autoRunnerChrome extends AbstractTestNGCucumberTests {
}
  