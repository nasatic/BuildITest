Feature: Registration 

Scenario Outline: Register a user in USA 

	Given User is on registration page 
	When User enters registration details 
	And Users clicks on Register Button 
	Then User is successfully Registered 
	
	Examples:
	
		|Fields | Value|
		|  FirstName   | Jonathan|
		|  LastName   |  Mann|
		|  Email   |   |
		|  Password  |  billyjones  |
		|  Day  |  14  |
		|   Month |  September|
		|   Year |  1978 |
		|   Company  | Willians Jones Limited   |
		|   Address1    |  50 Williams Lane  |
		|   Address2 |  Wakerfield  |
		|   City  |  Oarkland  |
		|   State  |  California  |
		|   ZIP Code  |  75315  |
		|   Country  | United States   |
		|   Additional Information  | The provider, however,remains responsible for hardware and network administration . The provider, however,remains responsible for hardware and network administration,The provider, however,remains responsible for hardware and network administration| 
		|  Home Phone   |  214-775-4122  |
		|  Mobile   |  214-478-5545  |
		|   Address Alias  |  is detailed as above  |