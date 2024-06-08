Feature: Login functionality
Scenario: Login to application
Given I am at loginpage
When I enter username
And I enter password
And I click on login button
Then I should get logged into application

Scenario: verification of title
Given I am at loginpage
Then I should verify title of page
