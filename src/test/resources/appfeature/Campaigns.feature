@campaigns
Feature: Sending email campaign
@regression
Scenario: Create campaign 
Given user is at campaigns page
When user click on create campaign button
And user enters the details
Then campaign gets created

@functional
Scenario: Scheduling campaign 
Given user is at campaigns page
When user click on edit campaign button
And user enters the schedule
Then campaign gets schedule

@sanity
Scenario: validating sent campaign
Given user is at campaigns page
And user should have a sent campaign
Then user should see the count of campaign
