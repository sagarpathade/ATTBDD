Feature: Profile operations

Background:
Given user should present on home page

Scenario: Creation of profile
When user clicks on add profile button
And user enters the data
Then Profile should get created

Scenario: updation of profile
When user clicks on edit profile button
And user updates the data
Then Profile should get modified

Scenario: deletion of profile
When user clicks on delete profile button
Then Profile should get deleted