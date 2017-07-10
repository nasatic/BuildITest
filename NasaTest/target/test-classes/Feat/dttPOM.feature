Feature: Login to dt&t site and assert Page contents 

Scenario: Login to site with Valid Credentials 
	Given User is on Logon Page of DTT site 
	When User enters userID 
	And User enters password 
	Then User logs on 
	And if user clicks on logout button 
	Then user can logout and close browser 
	
Scenario: Verify User Account and Assertions 
	Given user is still logged on 
	When user navigates to Personal Information Page 
	Then user can view thier customerID 
	And if user clicks on Address details 
	Then users address page is loaded 
	And user can verify their address details 
	And User can sign out and close browser 
	
Scenario: Login to site with InValid Credentials 
	Given User is onto DTT site 
	When User enters valid userID but invalid password 
	Then User should not be logged on 
	And User enters Invalid userID but valid password 
	Then User is not logged on 
	And if user enter correct password and UserID 
	Then user is logged on without error 
	And User Close and Quit Browser 
 