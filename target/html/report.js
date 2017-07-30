$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feat/autosite.feature");
formatter.feature({
  "line": 1,
  "name": "Login and out of automation Practice website.",
  "description": "",
  "id": "login-and-out-of-automation-practice-website.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "login-and-out-of-automation-practice-website.;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on log on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter userid and passwod",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user is logged on successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoStepDefFOX.user_is_on_log_on_home_page()"
});
formatter.result({
  "duration": 74916264627,
  "status": "passed"
});
formatter.match({
  "location": "AutoStepDefFOX.user_enter_userid_and_passwod()"
});
formatter.result({
  "duration": 21693047810,
  "status": "passed"
});
formatter.match({
  "location": "AutoStepDefFOX.clicks_on_Login_button()"
});
formatter.result({
  "duration": 7434107322,
  "status": "passed"
});
formatter.match({
  "location": "AutoStepDefFOX.user_is_logged_on_successfully()"
});
formatter.result({
  "duration": 58633288,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Go to address Page and Logout",
  "description": "",
  "id": "login-and-out-of-automation-practice-website.;go-to-address-page-and-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "that user is logged on",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user clicks on my address",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user is taken to address page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "if user clicks on add new address button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user is taken to the page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user can sign out and close browser",
  "keyword": "And "
});
formatter.match({
  "location": "AutoStepDefFOX.that_user_is_logged_on()"
});
formatter.result({
  "duration": 33616273,
  "status": "passed"
});
formatter.match({
  "location": "AutoStepDefFOX.user_clicks_on_my_address()"
});
formatter.result({
  "duration": 5617807248,
  "status": "passed"
});
formatter.match({
  "location": "AutoStepDefFOX.user_is_taken_to_address_page()"
});
formatter.result({
  "duration": 187846665,
  "status": "passed"
});
formatter.match({
  "location": "AutoStepDefFOX.if_user_clicks_on_add_new_address_button()"
});
formatter.result({
  "duration": 6570048869,
  "status": "passed"
});
formatter.match({
  "location": "AutoStepDefFOX.user_is_taken_to_the_page()"
});
formatter.result({
  "duration": 191796321,
  "status": "passed"
});
formatter.match({
  "location": "AutoStepDefFOX.user_can_sign_out_and_close_browser()"
});
formatter.result({
  "duration": 10742230656,
  "status": "passed"
});
});