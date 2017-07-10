Feature: Login and out of automation Practice website. 

Scenario: Login 
	Given User is on log on home page 
	When User enter userid and passwod 
	And Clicks on Login button 
	Then user is logged on successfully 
	
Scenario: Go to address Page and Logout 
	Given that user is logged on 
	When user clicks on my address 
	Then user is taken to address page 
	And if user clicks on add new address button 
	Then user is taken to the page 
	And user can sign out and close browser