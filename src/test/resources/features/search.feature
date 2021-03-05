Feature: SearchFeature
Scenario: verify search feature
Given I am on Home Page
When I search for "dress"
Then I should see dress related products
