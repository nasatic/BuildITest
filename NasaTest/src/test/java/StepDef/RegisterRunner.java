package StepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/simpleSteps1/Register.feature", 
                 format = { "pretty", "html:target/html" })

public class RegisterRunner {

}
