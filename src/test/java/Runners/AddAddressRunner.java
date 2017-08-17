package Runners;

import org.junit.runner.RunWith;
import org.testng.annotations.Parameters;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
//@Parameters("browsers")
@CucumberOptions(
        features = "src/test/java/Feat/AddAddress.feature",
        glue = "StepDef",
        format = {"html:target/html","json:target/html/cucumber-pretty"})

public class AddAddressRunner extends AbstractTestNGCucumberTests {

}
