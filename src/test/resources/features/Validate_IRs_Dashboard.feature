Feature: Validate IR's dashboard page

@test
Scenario Outline: VO1_3.0
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system
And check IR name "<name>"
#And check IRs last login
And check status of membership "<status>"
And check main plan Pay Rank "<mpay_rank>"
And check main plan Title Rank "<mtitle_rank>"
And check rsp plan Pay Rank "<rpay_rank>"
And check rsp plan Title Rank "<rtitle_rank>"

Examples:
|PLAN  |vo_option|UserName|Password|name    |status     |mpay_rank|mtitle_rank|rpay_rank  |rtitle_rank|
|world |current  |HU269793|testpw  |IVAN WO0|NON-RENEWED|Gold Star|Gold Star  |Bronze Star|Bronze Star| 


@test
Scenario Outline: VO1_3.1
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system
And check IRs last login

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |HU269793|testpw  |

@test
Scenario Outline: VO1_3.1
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then validate the notification 

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |AA016385|testpw  |

@test
Scenario Outline: VO1_3.4
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And enter q-acc pin "<q_pin>"
And validate q-acc bal


Examples:
|PLAN  |vo_option|UserName|Password|q_pin|
|world |current  |HD000404|testpw  |qatest|

@test1
Scenario Outline: VO1_3.6
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify IR banner image one
And verify IR banner image two

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |HD000404|testpw  |

@test1
Scenario Outline: VO1_3.8
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify RC banner image one 
And verify RC banner image two
And verify RC banner image three


Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |CU000489|testpw  |

@test
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

@test
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

@test
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

@test
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

@test
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

@test
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

@test
Scenario Outline: VO1_3.19
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then User should able to login to the system 
And verify News and updates
And validate the news page 
Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |HU269793|testpw  |

@test
Scenario Outline: VO1_3.20
Given User opens "<PLAN>" home page
When User click on ir login
And click on vo_option "<vo_option>"
And User enter valid "<UserName>" and "<Password>" 
Then  User should able to login to the system 
And verify functionality of BV counter

Examples:
|PLAN  |vo_option|UserName|Password|
|world |current  |HU269793|testpw  |

