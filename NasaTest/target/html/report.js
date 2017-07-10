$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feat/AddAddress.feature");
formatter.feature({
  "line": 1,
  "name": "Registered Users Can Add and delete added Address.",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Add address to Profile",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in with valid \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User_Clicks On MyAddresses Link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Adds \"\u003cAddress1\u003e\" and \"\u003cCity\u003e\" and \"\u003cState\u003e\" and \"\u003cZIPCode\u003e\" and \"\u003cCountry\u003e\" and \"\u003cHomePhone\u003e\" and \"\u003cMobile\u003e\" and \"\u003cAddInfo\u003e\" and \"\u003cAddrAlias\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "New Address is added To Addresses Grid",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Can delete added addresses and logout",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Address1",
        "City",
        "State",
        "ZIPCode",
        "Country",
        "HomePhone",
        "Mobile",
        "AddInfo",
        "AddrAlias"
      ],
      "line": 11,
      "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;1"
    },
    {
      "cells": [
        "testing01@mine.com",
        "billyjones",
        "10 Applian Way",
        "Dallas",
        "Texas",
        "71241",
        "United States",
        "214-210-1154",
        "215-214-2547",
        "This address is added by the user",
        "My 2nd Address"
      ],
      "line": 12,
      "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;2"
    },
    {
      "cells": [
        "testing02@mine.com",
        "billyjones",
        "124 Madison Way",
        "Dallas",
        "Texas",
        "71352",
        "United States",
        "214-210-2139",
        "215-214-2547",
        "This address is added by the user",
        "My Extra Address"
      ],
      "line": 13,
      "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;3"
    },
    {
      "cells": [
        "testing03@mine.com",
        "billyjones",
        "1141 Wall Street",
        "Brooklyn",
        "New York",
        "85124",
        "United States",
        "214-210-8578",
        "215-214-2547",
        "This address is added by the user",
        "Extra Added Address"
      ],
      "line": 14,
      "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;4"
    },
    {
      "cells": [
        "testing05@mine.com",
        "billyjones",
        "12 Dove Court",
        "Houston",
        "Texas",
        "72241",
        "United States",
        "314-102-1478",
        "215-214-2547",
        "This address is added by the user",
        "Address No Two"
      ],
      "line": 15,
      "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;5"
    },
    {
      "cells": [
        "testing06@mine.com",
        "billyjones",
        "221 Bill Way",
        "Dallas",
        "Texas",
        "71352",
        "United States",
        "214-210-2587",
        "215-214-2547",
        "This address is added by the user",
        "Extra Address"
      ],
      "line": 16,
      "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Add address to Profile",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in with valid \"testing01@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User_Clicks On MyAddresses Link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Adds \"10 Applian Way\" and \"Dallas\" and \"Texas\" and \"71241\" and \"United States\" and \"214-210-1154\" and \"215-214-2547\" and \"This address is added by the user\" and \"My 2nd Address\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "New Address is added To Addresses Grid",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Can delete added addresses and logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing01@mine.com",
      "offset": 30
    },
    {
      "val": "billyjones",
      "offset": 55
    }
  ],
  "location": "AddAddrStepDef.User_is_logged_in_with_valid_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 224854634547,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.User_Clicks_On_MyAddresses_Link()"
});
formatter.result({
  "duration": 18926984552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10 Applian Way",
      "offset": 11
    },
    {
      "val": "Dallas",
      "offset": 32
    },
    {
      "val": "Texas",
      "offset": 45
    },
    {
      "val": "71241",
      "offset": 57
    },
    {
      "val": "United States",
      "offset": 69
    },
    {
      "val": "214-210-1154",
      "offset": 89
    },
    {
      "val": "215-214-2547",
      "offset": 108
    },
    {
      "val": "This address is added by the user",
      "offset": 127
    },
    {
      "val": "My 2nd Address",
      "offset": 167
    }
  ],
  "location": "AddAddrStepDef.User_Adds_Address1_and_City_and_State_and_ZIPCode_and_Country_and_HomePhone_and_Mobile_and_AddInfo_and_AddrAlias(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 16190048022,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.New_Address_is_added_To_Addresses_Grid()"
});
formatter.result({
  "duration": 321097925,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.And_User_Can_delete_added_addresses_and_logout()"
});
formatter.result({
  "duration": 22039810368,
  "status": "passed"
});
formatter.after({
  "duration": 733500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Add address to Profile",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in with valid \"testing02@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User_Clicks On MyAddresses Link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Adds \"124 Madison Way\" and \"Dallas\" and \"Texas\" and \"71352\" and \"United States\" and \"214-210-2139\" and \"215-214-2547\" and \"This address is added by the user\" and \"My Extra Address\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "New Address is added To Addresses Grid",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Can delete added addresses and logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing02@mine.com",
      "offset": 30
    },
    {
      "val": "billyjones",
      "offset": 55
    }
  ],
  "location": "AddAddrStepDef.User_is_logged_in_with_valid_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 58417196902,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.User_Clicks_On_MyAddresses_Link()"
});
formatter.result({
  "duration": 17069575746,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "124 Madison Way",
      "offset": 11
    },
    {
      "val": "Dallas",
      "offset": 33
    },
    {
      "val": "Texas",
      "offset": 46
    },
    {
      "val": "71352",
      "offset": 58
    },
    {
      "val": "United States",
      "offset": 70
    },
    {
      "val": "214-210-2139",
      "offset": 90
    },
    {
      "val": "215-214-2547",
      "offset": 109
    },
    {
      "val": "This address is added by the user",
      "offset": 128
    },
    {
      "val": "My Extra Address",
      "offset": 168
    }
  ],
  "location": "AddAddrStepDef.User_Adds_Address1_and_City_and_State_and_ZIPCode_and_Country_and_HomePhone_and_Mobile_and_AddInfo_and_AddrAlias(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 16232072125,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.New_Address_is_added_To_Addresses_Grid()"
});
formatter.result({
  "duration": 316825946,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.And_User_Can_delete_added_addresses_and_logout()"
});
formatter.result({
  "duration": 16194370572,
  "status": "passed"
});
formatter.after({
  "duration": 807228,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Add address to Profile",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in with valid \"testing03@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User_Clicks On MyAddresses Link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Adds \"1141 Wall Street\" and \"Brooklyn\" and \"New York\" and \"85124\" and \"United States\" and \"214-210-8578\" and \"215-214-2547\" and \"This address is added by the user\" and \"Extra Added Address\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "New Address is added To Addresses Grid",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Can delete added addresses and logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing03@mine.com",
      "offset": 30
    },
    {
      "val": "billyjones",
      "offset": 55
    }
  ],
  "location": "AddAddrStepDef.User_is_logged_in_with_valid_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 37966921107,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.User_Clicks_On_MyAddresses_Link()"
});
formatter.result({
  "duration": 14558030910,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1141 Wall Street",
      "offset": 11
    },
    {
      "val": "Brooklyn",
      "offset": 34
    },
    {
      "val": "New York",
      "offset": 49
    },
    {
      "val": "85124",
      "offset": 64
    },
    {
      "val": "United States",
      "offset": 76
    },
    {
      "val": "214-210-8578",
      "offset": 96
    },
    {
      "val": "215-214-2547",
      "offset": 115
    },
    {
      "val": "This address is added by the user",
      "offset": 134
    },
    {
      "val": "Extra Added Address",
      "offset": 174
    }
  ],
  "location": "AddAddrStepDef.User_Adds_Address1_and_City_and_State_and_ZIPCode_and_Country_and_HomePhone_and_Mobile_and_AddInfo_and_AddrAlias(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 15262431111,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.New_Address_is_added_To_Addresses_Grid()"
});
formatter.result({
  "duration": 162777112,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.And_User_Can_delete_added_addresses_and_logout()"
});
formatter.result({
  "duration": 13383362770,
  "status": "passed"
});
formatter.after({
  "duration": 198971,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Add address to Profile",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in with valid \"testing05@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User_Clicks On MyAddresses Link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Adds \"12 Dove Court\" and \"Houston\" and \"Texas\" and \"72241\" and \"United States\" and \"314-102-1478\" and \"215-214-2547\" and \"This address is added by the user\" and \"Address No Two\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "New Address is added To Addresses Grid",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Can delete added addresses and logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing05@mine.com",
      "offset": 30
    },
    {
      "val": "billyjones",
      "offset": 55
    }
  ],
  "location": "AddAddrStepDef.User_is_logged_in_with_valid_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 38478396470,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.User_Clicks_On_MyAddresses_Link()"
});
formatter.result({
  "duration": 13697316626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12 Dove Court",
      "offset": 11
    },
    {
      "val": "Houston",
      "offset": 31
    },
    {
      "val": "Texas",
      "offset": 45
    },
    {
      "val": "72241",
      "offset": 57
    },
    {
      "val": "United States",
      "offset": 69
    },
    {
      "val": "314-102-1478",
      "offset": 89
    },
    {
      "val": "215-214-2547",
      "offset": 108
    },
    {
      "val": "This address is added by the user",
      "offset": 127
    },
    {
      "val": "Address No Two",
      "offset": 167
    }
  ],
  "location": "AddAddrStepDef.User_Adds_Address1_and_City_and_State_and_ZIPCode_and_Country_and_HomePhone_and_Mobile_and_AddInfo_and_AddrAlias(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 16407494089,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.New_Address_is_added_To_Addresses_Grid()"
});
formatter.result({
  "duration": 10203110666,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027center_column\u0027]/div[1]/p[1]/strong\"}\n  (Session info: chrome with embedded Chromium 58.0.3029.110)\n  (Driver info: OperaDriver\u003d2.27 (f61056e560d197467fd6d27c7fbd7fea572fe8bd),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.11 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027NASATIC-ACER\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.opera.OperaDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27 (f61056e560d197467fd6d27c7fbd7fea572fe8bd), userDataDir\u003dC:\\Users\\IBEOK_~1\\AppData\\Local\\Temp\\scoped_dir31772_19289}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: aebdc4dee77bf64e06897bc66a300e75\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027center_column\u0027]/div[1]/p[1]/strong}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat com.auto.PageClasses.AutoPracticePOM.assertAddressPage(AutoPracticePOM.java:129)\r\n\tat StepDef.AddAddrStepDef.New_Address_is_added_To_Addresses_Grid(AddAddrStepDef.java:62)\r\n\tat ✽.Then New Address is added To Addresses Grid(src/test/java/Feat/AddAddress.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddAddrStepDef.And_User_Can_delete_added_addresses_and_logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 6226720,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDef.RegNewStepDef.tdown(RegNewStepDef.java:120)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:108)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:661)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:869)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1193)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:126)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:744)\r\n\tat org.testng.TestRunner.run(TestRunner.java:602)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:380)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:375)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:340)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:289)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1301)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1226)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1144)\r\n\tat org.testng.TestNG.run(TestNG.java:1115)\r\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)\r\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:127)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 16,
  "name": "Add address to Profile",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;add-address-to-profile;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in with valid \"testing06@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User_Clicks On MyAddresses Link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Adds \"221 Bill Way\" and \"Dallas\" and \"Texas\" and \"71352\" and \"United States\" and \"214-210-2587\" and \"215-214-2547\" and \"This address is added by the user\" and \"Extra Address\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9,
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "New Address is added To Addresses Grid",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Can delete added addresses and logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing06@mine.com",
      "offset": 30
    },
    {
      "val": "billyjones",
      "offset": 55
    }
  ],
  "location": "AddAddrStepDef.User_is_logged_in_with_valid_Username_and_Password(String,String)"
});
formatter.result({
  "duration": 59517423711,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.User_Clicks_On_MyAddresses_Link()"
});
formatter.result({
  "duration": 14158009359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "221 Bill Way",
      "offset": 11
    },
    {
      "val": "Dallas",
      "offset": 30
    },
    {
      "val": "Texas",
      "offset": 43
    },
    {
      "val": "71352",
      "offset": 55
    },
    {
      "val": "United States",
      "offset": 67
    },
    {
      "val": "214-210-2587",
      "offset": 87
    },
    {
      "val": "215-214-2547",
      "offset": 106
    },
    {
      "val": "This address is added by the user",
      "offset": 125
    },
    {
      "val": "Extra Address",
      "offset": 165
    }
  ],
  "location": "AddAddrStepDef.User_Adds_Address1_and_City_and_State_and_ZIPCode_and_Country_and_HomePhone_and_Mobile_and_AddInfo_and_AddrAlias(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 29196599431,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.New_Address_is_added_To_Addresses_Grid()"
});
formatter.result({
  "duration": 240822144,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.And_User_Can_delete_added_addresses_and_logout()"
});
formatter.result({
  "duration": 14883750551,
  "status": "passed"
});
formatter.after({
  "duration": 983043,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "User deletes added addresses",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "user is logged in with \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user opens address page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "clicks on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Second address is deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user signs out",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 26,
      "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;1"
    },
    {
      "cells": [
        "testing01@mine.com",
        "billyjones"
      ],
      "line": 27,
      "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;2"
    },
    {
      "cells": [
        "testing02@mine.com",
        "billyjones"
      ],
      "line": 28,
      "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;3"
    },
    {
      "cells": [
        "testing03@mine.com",
        "billyjones"
      ],
      "line": 29,
      "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;4"
    },
    {
      "cells": [
        "testing05@mine.com",
        "billyjones"
      ],
      "line": 30,
      "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;5"
    },
    {
      "cells": [
        "testing06@mine.com",
        "billyjones"
      ],
      "line": 31,
      "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 27,
  "name": "User deletes added addresses",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "user is logged in with \"testing01@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user opens address page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "clicks on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Second address is deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user signs out",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing01@mine.com",
      "offset": 24
    },
    {
      "val": "billyjones",
      "offset": 49
    }
  ],
  "location": "AddAddrStepDef.user_is_logged_in_with(String,String)"
});
formatter.result({
  "duration": 50057024473,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_opens_address_page()"
});
formatter.result({
  "duration": 11169164523,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.clicks_on_Delete_button()"
});
formatter.result({
  "duration": 2414494010,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.Second_address_is_deleted()"
});
formatter.result({
  "duration": 361551,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_signs_out()"
});
formatter.result({
  "duration": 9623901816,
  "status": "passed"
});
formatter.after({
  "duration": 624326,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User deletes added addresses",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "user is logged in with \"testing02@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user opens address page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "clicks on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Second address is deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user signs out",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing02@mine.com",
      "offset": 24
    },
    {
      "val": "billyjones",
      "offset": 49
    }
  ],
  "location": "AddAddrStepDef.user_is_logged_in_with(String,String)"
});
formatter.result({
  "duration": 31060975074,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_opens_address_page()"
});
formatter.result({
  "duration": 10784005339,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.clicks_on_Delete_button()"
});
formatter.result({
  "duration": 2405547855,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.Second_address_is_deleted()"
});
formatter.result({
  "duration": 155018,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_signs_out()"
});
formatter.result({
  "duration": 10090048543,
  "status": "passed"
});
formatter.after({
  "duration": 226856,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "User deletes added addresses",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "user is logged in with \"testing03@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user opens address page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "clicks on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Second address is deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user signs out",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing03@mine.com",
      "offset": 24
    },
    {
      "val": "billyjones",
      "offset": 49
    }
  ],
  "location": "AddAddrStepDef.user_is_logged_in_with(String,String)"
});
formatter.result({
  "duration": 35928865092,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_opens_address_page()"
});
formatter.result({
  "duration": 10721896459,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.clicks_on_Delete_button()"
});
formatter.result({
  "duration": 2349003086,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.Second_address_is_deleted()"
});
formatter.result({
  "duration": 121935,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_signs_out()"
});
formatter.result({
  "duration": 9782487767,
  "status": "passed"
});
formatter.after({
  "duration": 184320,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "User deletes added addresses",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "user is logged in with \"testing05@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user opens address page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "clicks on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Second address is deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user signs out",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing05@mine.com",
      "offset": 24
    },
    {
      "val": "billyjones",
      "offset": 49
    }
  ],
  "location": "AddAddrStepDef.user_is_logged_in_with(String,String)"
});
formatter.result({
  "duration": 56960760553,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_opens_address_page()"
});
formatter.result({
  "duration": 21268788745,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.clicks_on_Delete_button()"
});
formatter.result({
  "duration": 11872187519,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027center_column\u0027]/div/div/div[2]/ul/li[9]/a[2]/span\"}\n  (Session info: chrome with embedded Chromium 58.0.3029.110)\n  (Driver info: OperaDriver\u003d2.27 (f61056e560d197467fd6d27c7fbd7fea572fe8bd),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.44 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027NASATIC-ACER\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.opera.OperaDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27 (f61056e560d197467fd6d27c7fbd7fea572fe8bd), userDataDir\u003dC:\\Users\\IBEOK_~1\\AppData\\Local\\Temp\\scoped_dir19480_10758}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 99d3119da90ab114d5033913a8fdb066\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027center_column\u0027]/div/div/div[2]/ul/li[9]/a[2]/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:402)\r\n\tat com.auto.PageClasses.AutoPracticePOM.delete2ndAddress(AutoPracticePOM.java:119)\r\n\tat StepDef.AddAddrStepDef.clicks_on_Delete_button(AddAddrStepDef.java:98)\r\n\tat ✽.And clicks on Delete button(src/test/java/Feat/AddAddress.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddAddrStepDef.Second_address_is_deleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddAddrStepDef.user_signs_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 366277,
  "error_message": "java.lang.NullPointerException\r\n\tat StepDef.RegNewStepDef.tdown(RegNewStepDef.java:120)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:108)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:661)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:869)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1193)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:126)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:744)\r\n\tat org.testng.TestRunner.run(TestRunner.java:602)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:380)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:375)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:340)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:289)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1301)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1226)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1144)\r\n\tat org.testng.TestNG.run(TestNG.java:1115)\r\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:72)\r\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:127)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 31,
  "name": "User deletes added addresses",
  "description": "",
  "id": "registered-users-can-add-and-delete-added-address.;user-deletes-added-addresses;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "user is logged in with \"testing06@mine.com\" and \"billyjones\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user opens address page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "clicks on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Second address is deleted",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user signs out",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "testing06@mine.com",
      "offset": 24
    },
    {
      "val": "billyjones",
      "offset": 49
    }
  ],
  "location": "AddAddrStepDef.user_is_logged_in_with(String,String)"
});
formatter.result({
  "duration": 96845078244,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_opens_address_page()"
});
formatter.result({
  "duration": 11401344877,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.clicks_on_Delete_button()"
});
formatter.result({
  "duration": 3701823496,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.Second_address_is_deleted()"
});
formatter.result({
  "duration": 245288,
  "status": "passed"
});
formatter.match({
  "location": "AddAddrStepDef.user_signs_out()"
});
formatter.result({
  "duration": 13291028655,
  "status": "passed"
});
formatter.after({
  "duration": 174395,
  "status": "passed"
});
});