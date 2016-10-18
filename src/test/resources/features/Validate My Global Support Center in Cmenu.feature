Feature: Validate  My Global Support Center in Cmenu 

Scenario Outline: VO1_13.0
Given User opens "<PLAN>" home page
And User click on ir login
And click on current virtual office
And User should able to direct to Online_Login_VO page "<url>"
And Proceed to VO 1 Login page
And Enter credential "<username>" & "<password>"
And Click on login btn
And User should direct to PopupdLoad page "<poploadurl>"
And user should click on My Global Support Center button
And user should proceed to Dashboard page "<DashboardURL>"


