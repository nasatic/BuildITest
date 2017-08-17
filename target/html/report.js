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
