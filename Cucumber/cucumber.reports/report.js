$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Package1/Demo.feature");
formatter.feature({
  "name": "BankLogin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters \"Shivaa\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters \"abcd@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step.enters(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "When "
});
formatter.match({
  "location": "Step.click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Bank Home Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.bank_Home_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});