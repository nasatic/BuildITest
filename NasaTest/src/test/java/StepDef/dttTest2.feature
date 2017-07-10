Feature: Logon 

Scenario Outline: 

	Given user is on website 
	When user enters correct "<UserID>" and "<AccessWord>" 
	Then user is logged on 
	
	Examples: 
	
		|UserID         |AccessWord  |
		|test1@email.com|	password |
		|test2@email.com|	password1|
		|test3@email.com|   password2|
		|test4@email.com|	password3|
		|test5@email.com|   password4|
		
		
		
		
		
 