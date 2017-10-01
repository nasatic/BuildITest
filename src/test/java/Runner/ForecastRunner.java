package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(strict = false,
        features = "src/test/java/FeatureFiles/forecast.feature",
        glue = "Steps",
        plugin = {"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt","html:target/html/cucumber-html-reports",
       "usage:target/cucumber-usage.json"})
//        tags = {"@Ibe"})

//public class ForecastRunner extends AbstractTestNGCucumberTests {
public class ForecastRunner {

}

