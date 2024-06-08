Feature: Opening bank account
Scenario: Registration with nominee
Given User should be at the registration page
When User enters the data in following manner
| firstname | lastname | email | mobile |
| Eder | Smith | eder.smith@gmail.com | 9988776655 |
| Ron | Dutta | ron.dutta@gmail.com | 8877665544|
And user clicks on submit button
Then account should get created