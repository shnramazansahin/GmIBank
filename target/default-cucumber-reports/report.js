$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\DummyTest.feature");
formatter.feature({
  "name": "Dummy Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "All tests",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dumTest"
    }
  ]
});
formatter.step({
  "name": "user tries tests",
  "keyword": "Given "
});
formatter.match({
  "location": "DummyTestSteps.user_tries_tests()"
});
formatter.result({
  "status": "passed"
});
});