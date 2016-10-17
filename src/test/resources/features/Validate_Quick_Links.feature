Feature: Validate Quick Links
@test44
Scenario Outline: 
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