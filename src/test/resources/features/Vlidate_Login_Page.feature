Feature: Validate Login Page

@test
Scenario Outline: VO1_1.33, VO1_1.34 Verify login using different Languages 
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And select the language "<lang>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system

Examples:
|PLAN  |vo_option|lang|UserName|Password|
|world |current  |ar  |AB333693|testpw  |
|world |current  |id  |AB333693|testpw  |
|world |current  |en  |AB333693|testpw  |
|world |current  |fr  |AB333693|testpw  |
|world |current  |ru  |AB333693|testpw  |
|world |current  |lo  |AB333693|testpw  |

@test
Scenario Outline: VO1_1.36 Verify unable to login with invalid credentials, VO1_1.50 Register only account,VO1_1.24 ransferred IR account, VO1_1.45 LOGIN / VO Blocked
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should not be able to login to the system

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |HY934645|testpw  |
|world |current  |HZ698758|testpw  |
|world |current  |HC062000|testpw  |
|world |current  |AB206443|testpw  |

@test
Scenario Outline: VO1_1.38  BronzeIR, VO1_1.41 Gold Star-Migrate from QNet Senior Rank, VO1_1.47 RC, VO1_1.20 Non-renewed IR 5 years, VO1_1.39 Silver IR, VO1_1.44 Diamond IR, VO1_1.46 Change Add(AE to WP),VO1_1.28 RNF blocked account
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |HD000176|testpw  |
#|world |current  |AB206443|testpw  |
|world |current  |CU000489|testpw  |
|world |current  |HA148760|testpw  |
|world |current  |HD328443|testpw  |
|world |current  |HD328717|testpw  |
|world |current  |HY187731|testpw  |
|world |current  |AB333693|testpw  |
|world |current  |HD000014|testpw  |


Scenario Outline: VO1_1.49 Enrol Retail Customer under WP UAE
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And click on enrol as RC 
And check referrer "<ref_id>"
And select country "<country>"
And click on shop button 

Examples:
|PLAN  |vo_option|ref_id|country|
|world |current  |||
|world |current  |||
