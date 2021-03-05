Feature: Auto generated Search
Scenario: Verify search with auto generated pop up
Given I am in Home page
When I search for "Jeans"
And I click on particular jeans
Then I should be able to see it in page