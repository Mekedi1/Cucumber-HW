$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/TechfiosLogin.feature");
formatter.feature({
  "name": "Techfios billing login page functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_username_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@LoginScenario1"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on bankCash",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_clicks_on_bankCash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on newAccount",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_clicks_on_newAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_should_land_on_accounts_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accoutTitle as \"saving\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_accoutTitle_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters discription as \"abcd\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_discription_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters initialBalance as \"50\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_initialBalance_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters accountNumber as \"123456789\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_accountNumber_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters contactPerson as \"Mekedelawit Asfaw\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_contactPerson_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters phone as \"123-345-6789\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_phone_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters internetBankingURL as \"https://techfios.com/billing/?ng\u003daccounts/add/\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_enters_internetBankingURL_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepsDefinition.User_clicks_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});