Feature: login functionality with data
Scenario: login to application with data
Given user should be at loginpage
When I enter username as "testuser"
And I enter password as "Test@1234"
And I click on login 1 button
Then I should be able to logged in