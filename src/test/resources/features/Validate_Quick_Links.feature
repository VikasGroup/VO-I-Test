Feature: Validate Quick Links

Scenario Outline: VO1_10.0
Given User opens "<PLAN>" home page
And User click on ir login
And click on current virtual office
And User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
When user click on GR visual link
Then user should be direct to Genealogy Report - Visual Genealogy with popup window "<GenealogyPopUp>"

Examples:

|username 	| password 	|PLAN     | url 																		|poploadurl																|GenealogyPopUp										|
|HD000404	|testpw		| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx 	|https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx	|https://portal.qntest.com/EDP/recordtcoext.aspx	|


Scenario Outline: VO1_10.2
Given User opens "<PLAN>" home page
And User click on ir login
And click on current virtual office
And User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
When user click on GR By Date link
And user should proceed to Dashboard page "<DashboardURL>"
Then user should be direct to Genealogy Report - By Date with popup window "<GenealogyByDatePopUp>"

Examples:

|username 	| password 	|PLAN     | url 																		|poploadurl																|DashboardURL																|GenealogyByDatePopUp										|
|HD000404	|testpw		| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx 	|https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx	|https://portal.qntest.com/VirtualOffice/OnlineEStore/Online_DashBoardNew.aspx	|https://portal.qntest.com/EDP/recordtcoext.aspx	|


Scenario Outline: VO1_10.9
Given User opens "<PLAN>" home page
And User click on ir login
And click on current virtual office
And User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
When user click on eCard Checker link
And user should proceed to Dashboard page "<DashboardURL>"
Then user should be direct to ecardchecker page with popup window "<ecardcheckerPopUp>"

Examples:

|username 	| password 	|PLAN     | url 																		|poploadurl																|DashboardURL																	|ecardcheckerPopUp										|
|HD000404	|testpw		| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx 	|https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx	|https://portal.qntest.com/VirtualOffice/OnlineEStore/Online_DashBoardNew.aspx	|https://portal.qntest.com/EDP/ecardchecker_tco.aspx	|



Scenario Outline: VO1_10.11
Given User opens "<PLAN>" home page
And User click on ir login
And click on current virtual office
And User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
When user click on Order And Payment link
And user should proceed to Dashboard page "<DashboardURL>"
Then user should be direct to Order And Payment page with popup window "<OrderAndPaymentpopupURL>"


Examples:

|username 	| password 	|PLAN     | url 																		|poploadurl																|DashboardURL																	|OrderAndPaymentpopupURL							|
|HD000404	|testpw		| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx 	|https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx	|https://portal.qntest.com/VirtualOffice/OnlineEStore/Online_DashBoardNew.aspx	|https://portal.qntest.com/EDP/orderpayment.aspx	|



Scenario Outline: VO1_10.13
Given User opens "<PLAN>" home page
And User click on ir login
And click on current virtual office
And User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
When user click on Track Shipment link
And user should proceed to Dashboard page "<DashboardURL>"
Then user should be direct to Track Shipment page with popup window "<TrackShipmentpopupURL>"

Examples:

|username 	| password 	|PLAN     | url 																		|poploadurl																|DashboardURL																	|TrackShipmentpopupURL							|
|HD000404	|testpw		| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx 	|https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx	|https://portal.qntest.com/VirtualOffice/OnlineEStore/Online_DashBoardNew.aspx	|https://portal.qntest.com/EDP/Prodship.aspx	|






