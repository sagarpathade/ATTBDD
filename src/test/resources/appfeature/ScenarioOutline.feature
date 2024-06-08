Feature: Signup functionality
Background:
Given user is logged into application

Scenario Outline: Signup to application
Given user is at signup page
When user enters name as "<name>" in the form
And user enters the age <age>
And user confirms the gender as "<gender>"
Then user will get created

Examples:
| name | age | gender |
| Eder | 23 | Male |
| Daniel | 24 | Male |
| Diana | 25 | Female |
