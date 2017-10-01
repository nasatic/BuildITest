package Steps;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.difflib.StringUtills;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import jdk.nashorn.internal.ir.IfNode;
import org.codehaus.plexus.util.StringUtils;
import org.junit.Assert;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.*;
import java.util.logging.Logger;


import static io.restassured.RestAssured.given;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertTrue;


public class ForecastStepDef {
    Logger logger = Logger.getLogger("ForecastStepDef");


    @Given("^I am an authenticated user$")
    public void iAmAnAuthenticatedUser() {
        // Write code here that turns the phrase above into concrete actions
        given()
                .when()
                .get("http://openweathermap.org/forecast5")
                .then()
                .statusCode(200);

    }

    @When("^I make a forecast request for city using id \"([^\"]*)\" and apiid \"([^\"]*)\"$")
    public void iMakeAForecastRequestForCityUsingIdAndApiid(int id, String appiid) throws Throwable {
        given()
                .contentType("application/json; charset=utf-8")
                .param("id", id)
                .param("appid", appiid)
                .when().log().all()
                .get("http://openweathermap.org/data/2.5/forecast")
                .then()
                .statusCode(200);
    }

    @Then("^I should get a valid response \"([^\"]*)\" using id \"([^\"]*)\" and apiid \"([^\"]*)\"$")
    public void iShouldGetAResponseCodeAs(int responseCode, int id, String apiid) throws Throwable {

        given()
                .contentType("application/json; charset=utf-8")
                .param("id", id)
                .param("appid", apiid)
                .when().log().all()
                .get("http://openweathermap.org/data/2.5/forecast")
                .then()
                .statusCode(responseCode);

    }

    @And("^Forecast for city with id \"([^\"]*)\" and apiid \"([^\"]*)\" is for \"([^\"]*)\" days$")
    public void forecastForCityWithIdAndApiidIsForDays(int id, String apiid, int days) throws Throwable {

        LocalDate fDate = LocalDate.now().plusDays(days);
        String forecastDate = fDate.toString();
        logger.info("Today in String is:" + forecastDate);


        Response res;
        res = given()
                .contentType("application/json; charset=utf-8")
                .param("id", id)
                .param("appid", apiid)
                .when().log().all()
                .get("http://openweathermap.org/data/2.5/forecast");

        String responseAsString = res.asString();
        logger.info("Json Response for dates:" + responseAsString);


        JsonPath jsonPath = new JsonPath(responseAsString);
        ArrayList<String> dateList = jsonPath.get("list.dt_txt");
// get the max date from the collection and pass it as a string
        String coll = Collections.max(dateList);

//  convert the date into desired format
        DateFormat requiredDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = inputFormat.parse(coll);
        String trimmedOutput = requiredDateFormat.format(date);
        logger.info("Maximum date trimmed :" + trimmedOutput);

        Assert.assertEquals(forecastDate, trimmedOutput);

    }

    @When("^I select a day again$")
    public void iSelectADayAgain() throws Throwable {

    }


    @Then("^I hide a three hourly notice$")
    public void iHideAThreeHourlyNotice() throws Throwable {


    }

    @When("^I make a forecast request for city using id \"([^\"]*)\" and apiid \"([^\"]*)\" for \"([^\"]*)\" days$")
    public void iMakeAForecastRequestForCityUsingIdAndApiidForDays(int id, String apiid, int days) throws Throwable {
        given()
                .contentType("application/json; charset=utf-8")
                .param("id", id)
                .param("appid", apiid)
                .param("cnt", days)
                .when().log().all()
                .get("http://openweathermap.org/data/2.5/forecast/daily").prettyPeek()
                .then()
                .statusCode(200);

    }

    @Then("^I should get a \"([^\"]*)\" hourly forecast$")
    public void iShouldGetAHourlyForecast(int hour) throws Throwable {
        Response res;
        res = given()
                .contentType("application/json; charset=utf-8")
                .param("id", 2650225)
                .param("appid", "b1b15e88fa797225412429c1c50c122a1")
                .when().log().all()
                .get("http://openweathermap.org/data/2.5/forecast");

        String responseAsString = res.asString();
        JsonPath jsonPath = new JsonPath(responseAsString);
        ArrayList<String> dateList = jsonPath.get("list.dt_txt");

        String first = dateList.get(0);
        String second = dateList.get(1);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstDate = df.parse(first);
        Date secondDate = df.parse(second);

        long diff = (secondDate.getTime() - firstDate.getTime()) / (60 * 60 * 1000);
        Assert.assertEquals(diff, hour);

    }

    @And("^Daily forecast should summarise three hour data for \"([^\"]*)\"$")
    public void dailyForecastShouldSummariseThreeHourDataFor(String data) throws Throwable {
        Response res =
                given()
                        .contentType("application/json; charset=utf-8")
                        .param("id", 2640358)
                        .param("appid", "b1b15e88fa797225412429c1c50c122a1")
                        .param("cnt", 1)
                        .when().log().all()
                        .get("http://openweathermap.org/data/2.5/forecast/daily");


        JsonPath jsonPath = new JsonPath(res.asString());
        ArrayList<String> cond = jsonPath.get("list");

        if (cond.contains(data)) {
            logger.info("Scenario Passed");
        } else {
            throw new RuntimeException("object missing from response list");

        }
    }


    @And("^All value will be rounded up$")
    public void allValueWillBeRoundedUp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}


