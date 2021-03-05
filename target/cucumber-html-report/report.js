$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "SearchFeature",
  "description": "",
  "id": "searchfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 31433256500,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "verify search feature",
  "description": "",
  "id": "searchfeature;verify-search-feature",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I search for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I should see dress related products",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_on_Home_Page()"
});
formatter.result({
  "duration": 1016862800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 14
    }
  ],
  "location": "SearchPageStepDef.i_search_for(String)"
});
formatter.result({
  "duration": 8729696700,
  "status": "passed"
});
formatter.match({
  "location": "ResultsPageStepDef.i_should_see_dress_related_products()"
});
formatter.result({
  "duration": 11678300,
  "status": "passed"
});
formatter.after({
  "duration": 65600,
  "status": "passed"
});
});