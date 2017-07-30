Feature: Place Order 

Scenario: Sucessfull Logon 
	Given User is on logon page 
	When User enteres valid email 
	And User enters valid password 
	Then User should be logged in 
	
Scenario: Logout 
	Given User is logged on 
	When User performs a serach 
	Then User is taken to the correct page 
	And User Clicks on Orders Page 
	Then User should land on Order History Page 
	
Scenario: Search and Logout 
	Given User had completed search 
	When User Clicks on Sign Out 
	Then  User is signed out of page 
