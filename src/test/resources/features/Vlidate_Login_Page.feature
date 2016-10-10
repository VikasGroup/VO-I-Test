Feature: Validate Login Page

@test
Scenario Outline: Verify if IR is able to login with correct credentials 
Given User opens "<PLAN>" home page
When User click on ir login
And User enter valid "<UserName>" and "<Password>"
Then User should able to login to the system

Examples:
|PLAN     | UserName | Password |
| world   | AB333693 | testpw   |