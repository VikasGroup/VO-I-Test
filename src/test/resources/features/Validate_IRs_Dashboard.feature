Feature: Validate IR's dashboard page


Scenario Outline: VO1_3.0
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system
And check IR name
And check IRs last login
And check status of member ship
And check Pay Rank
And check Title Rank
And check Pay Rank
And check Title Rank


Examples:
|PLAN  |vo_option|UserName|Password|
|||||


Scenario Outline: VO1_3.1
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then validate the notification 

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AA016385|testpw  |


Scenario Outline: VO1_3.4
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And validate q-acc bal

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |HD000404|testpw  |


Scenario Outline: VO1_3.6
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify IR banner

Examples:
|PLAN  |vo_option|UserName|Password|
|||||


Scenario Outline: VO1_3.8
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify Retail customer banner

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AB333693|testpw  |


Scenario Outline: VO1_3.12
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system 
And verify QNET official facebook page

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AB333693|testpw  |


Scenario Outline: VO1_3.13
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify QNET AR Twitter page

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AB333693|testpw  |


Scenario Outline: VO1_3.14
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify QNET official Twitter page

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AB333693|testpw  |


Scenario Outline: VO1_3.15
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify Qbuzz page

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AB333693|testpw  |


Scenario Outline: VO1_3.16
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify QNET official Youtube page

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AB333693|testpw  |

Scenario Outline: VO1_3.17
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify  QNET official Google plus page

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AB333693|testpw  |


Scenario Outline: VO1_3.19
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system 
And verify News and updates
Examples:
|PLAN  |vo_option|UserName|Password|
|||||


Scenario Outline: VO1_3.0
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify functionality of BV counter

Examples:
|PLAN  |vo_option|UserName|Password|
|||||

