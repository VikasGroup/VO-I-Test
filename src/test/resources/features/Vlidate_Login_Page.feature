Feature: Validate Login Page


Scenario Outline: Verify if IR is able to login with correct credentials 
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"

Examples:
|PLAN     | url |
| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx |


Scenario Outline: VO1_1.1
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And validate msg
Examples:
|username    | password |PLAN     | url |
|AB333693|1111111111| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx |


Scenario Outline: VO1_1.0
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
Examples:
|username    | password |PLAN     | url |poploadurl|
|AB333693|testpw| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx |https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx|


Scenario Outline: VO1_1.4
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Click on forgot password
And Enter IRID "<ir>"
And Click on submit
And Select email the code
And Click continue
And Validate Msg
Examples:
|ir |PLAN     | url |poploadurl|
|HU041741| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx |https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx|


Scenario Outline: VO1_1.7
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And select SHOP NOW directly tickbox
And Click on login btn
And User should direct to products page "<produrl>"
Examples:
|username| password |PLAN     | url                                                                       |produrl                                                              |
|AB333693|testpw    | world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx      |https://portal.qntest.com/eStore/products.aspx?Category=4010000&type=|


Scenario Outline: VO1_1.8
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Change language to AR
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
And Validate language
Examples:
|username    | password |PLAN     | url |poploadurl|
|AB333693|testpw| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx |https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx|



Scenario Outline: VO1_1.9 & VO1_1.10
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And validate msg
Examples:
|username    | password |PLAN     | url |
|HA075236|testpw| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx |

@test
Scenario Outline: VO1_1.11 & VO1_1.12
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And validate msg
Examples:
|username    | password |PLAN     | url |
|HA060652|testpw| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx |

@test
Scenario Outline: VO1_1.13 & VO1_1.14
Given User opens "<PLAN>" home page
When User click on ir login
And click on current virtual office
Then User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And validate msg
Examples:
|username    | password |PLAN     | url |
|AA020117|testpw| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx |

