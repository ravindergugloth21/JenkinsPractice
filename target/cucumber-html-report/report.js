$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Auto generated Search",
  "description": "",
  "id": "auto-generated-search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5808532300,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Verify search with auto generated pop up",
  "description": "",
  "id": "auto-generated-search;verify-search-with-auto-generated-pop-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I search for \"Jeans\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I click on particular jeans",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I should be able to see it in page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.i_am_in_Home_page()"
});
formatter.result({
  "duration": 215120200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jeans",
      "offset": 14
    }
  ],
  "location": "SearchSteps.i_search_for(String)"
});
formatter.result({
  "duration": 140086000,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_click_on_particular_jeans()"
});
formatter.result({
  "duration": 2224248800,
  "status": "passed"
});
formatter.match({
  "location": "VerifySteps.i_should_be_able_to_see_it_in_page()"
});
formatter.result({
  "duration": 82012700,
  "status": "passed"
});
formatter.after({
  "duration": 138145900,
  "status": "passed"
});
});