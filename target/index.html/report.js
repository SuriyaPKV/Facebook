$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/facebook.feature");
formatter.feature({
  "name": "Create Facebook Account",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Enter contact informations for all the fields and Create new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createnewaccount"
    }
  ]
});
formatter.step({
  "name": "Enter the name \"\u003cFirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the surname \"\u003cSurname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the number \"\u003cMobileNo\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Select date of birth \"\u003cDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Select date of month \"\u003cMonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Select date of year \"\u003cYear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Sign Up",
  "keyword": "And "
});
formatter.step({
  "name": "Take screenshot \"\u003cFirstname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Brokenlink \"https://www.facebook.com/\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Surname",
        "MobileNo",
        "Password",
        "Date",
        "Month",
        "Year"
      ]
    },
    {
      "cells": [
        "Suriya",
        "P",
        "7569034021",
        "Suriya@123",
        "21",
        "Jun",
        "1999"
      ]
    }
  ]
});
formatter.background({
  "name": "Launching facebook function",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Create new account",
  "keyword": "Given "
});
formatter.match({
  "location": "NewAccount.click_on_create_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Enter contact informations for all the fields and Create new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createnewaccount"
    }
  ]
});
formatter.step({
  "name": "Enter the name \"Suriya\"",
  "keyword": "When "
});
formatter.match({
  "location": "NewAccount.enter_the_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the surname \"P\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.enter_the_surname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the number \"7569034021\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.enter_the_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password \"Suriya@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.enter_the_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select date of birth \"21\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.select_date_of_birth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select date of month \"Jun\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.select_date_of_month(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select date of year \"1999\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.select_date_of_year(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Sign Up",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.click_on_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take screenshot \"Suriya\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewAccount.take_screenshot(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Brokenlink \"https://www.facebook.com/\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewAccount.brokenlink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});