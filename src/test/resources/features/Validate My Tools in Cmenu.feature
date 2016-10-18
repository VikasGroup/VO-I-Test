Feature: Validate My Tools in Cmenu

@test66
Scenario Outline: VO1_10.0
Given User opens "<PLAN>" home page
And User click on ir login
And click on current virtual office
And User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
And user should click on My Tools button
And user should proceed to Dashboard page "<DashboardURL>"
When user click on on e card checker
Then user should be direct to e card checker with popup window "<e_cardCheckerPopUp>"

Examples:

|username 	| password 	|PLAN     | url 																		|poploadurl																|DashboardURL																							|e_cardCheckerPopUp									|
|HD000404	|testpw		| world   | https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx 	|https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx	|https://portal.qntest.com/VirtualOffice/OnlineEStore/Online_DashBoardNew.aspx?cmenu=load&row=0&y=795	|https://portal.qntest.com/EDP/ecardchecker_tco.aspx|


