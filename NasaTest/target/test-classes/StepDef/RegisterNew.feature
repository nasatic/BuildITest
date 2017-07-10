Feature: Registering a new user 

Scenario Outline: Registering a new userin USA 

	Given User is on register page 
	When User enters initial "<firstEmail>" 
	And Users hits on register button 
	And User enters "<FirstName>" and "<LastName>" and "<Email>" and "<Password>" and "<Day>" and "<Month>" and "<Year>" and "<Company>" and "<Address1>" and "<Address2>" and "<City>" and "<State>" and "<ZIPCode>" and "<Country>" and "<AddInfo>" and "<HomePhone>" and "<Mobile>" and "<AddrAlias>" 
	And User Clicks on Register Button
	Then User is successfully registered 
	
	Examples: 
	
		|firstEmail         |FirstName | LastName   |Email    |Password   | Day |Month     |Year |Company      |Address1          |Address2|City      | State   |ZIPCode|Country      | AddInfo                     |HomePhone    |Mobile       |AddrAlias        |
		| testing10@mine.com|    Ugochukwu  | Okoro      |         |billyjones | 02  | July     |1980 |Dangote      |20 Madison Avenue |Buffallo|Appian    | Texas   |71254 |United States|Today is a beautiful day that our God has made.    |215-220-4514 |216-521-2548 | Home Sweet Home |
		| testing11@mine.com|    Onyi | Okoro     |         |billyjones | 14  | August   |1980 |SotheyBys LTD|20 Madison Avenue |Buffallo| Garston  | New York|72352 |United States|This is a day that out lord, we should rejoice and be glad in it.  |216-221-4514 |216-521-2548 | Home Sweet Home |
		| testing12@mine.com|    Gordon| Pierce      |         |billyjones | 08  | September|1980 | Nasatic LTD |20 Madison Avenue |Buffallo| Newark   | Georgia |71421 |United States|Data Tables in Cucumber are quite interesting and can be used in many ways. DataTables are also used to handle large amount of data. |217-222-4514 |216-521-2548 | Home Sweet Home |
		| testing13@mine.com|    Joe  | McGeady      |         |billyjones | 29  | October  |1980 | SDS Infotech|20 Madison Avenue |Buffallo| Boston   | Nevada  |62315 |United States|This is a day that out lord  |218-223-4514 |216-521-2548 | They are quite powerful|
		| testing09@mine.com|  Alistair  | Stevens      |         |billyjones | 17  | November |1980 |Madison Deutz|20 Madison Avenue |Buffallo| Manchester | New York|81245 |United States|Most of the people gets confused with Data tables & Scenario outline, but these two works completely differently. |219-225-4514 |216-521-2548 | Home Sweet Home |
