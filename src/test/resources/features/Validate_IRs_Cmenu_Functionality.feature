Feature: Validate IR's cmenu functionality

#@test1
Scenario Outline:
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system
And click on cmenu

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |HD000404|testpw  |


#@test1
Scenario Outline:
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And select the language "<lang>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system
And click on cmenu

Examples:
|PLAN  |vo_option|lang|UserName|Password|
|world |current  |ar  |HD000404|testpw  |


Scenario Outline:
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system
And click on cmenu

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |CU000489|testpw  |