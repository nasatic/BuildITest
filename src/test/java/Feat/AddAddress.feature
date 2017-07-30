Feature: Registered Users Can Add and delete added Address.

  Scenario Outline: Add address to Profile
    Given User is logged in with valid "<Username>" and "<Password>"
    When User_Clicks On MyAddresses Link
    And User Adds "<Address1>" and "<City>" and "<State>" and "<ZIPCode>" and "<Country>" and "<HomePhone>" and "<Mobile>" and "<AddInfo>" and "<AddrAlias>"
    Then New Address is added To Addresses Grid
    And User Can delete added addresses and logout

    Examples:
      | Username           | Password   | Address1         | City     | State    | ZIPCode | Country       | HomePhone    | Mobile       | AddInfo                           | AddrAlias           |
      | testing01@mine.com | billyjones | 10 Applian Way   | Dallas   | Texas    | 71241   | United States | 214-210-1154 | 215-214-2547 | This address is added by the user | My 2nd Address      |
      | testing02@mine.com | billyjones | 124 Madison Way  | Dallas   | Texas    | 71352   | United States | 214-210-2139 | 215-214-2547 | This address is added by the user | My Extra Address    |
      | testing03@mine.com | billyjones | 1141 Wall Street | Brooklyn | New York | 85124   | United States | 214-210-8578 | 215-214-2547 | This address is added by the user | Extra Added Address |
      | testing05@mine.com | billyjones | 12 Dove Court    | Houston  | Texas    | 72241   | United States | 314-102-1478 | 215-214-2547 | This address is added by the user | Address No Two      |
      | testing06@mine.com | billyjones | 221 Bill Way     | Dallas   | Texas    | 71352   | United States | 214-210-2587 | 215-214-2547 | This address is added by the user | Posh Address        |

  Scenario Outline: User deletes added addresses
    Given user is logged in with "<Username>" and "<Password>"
    When user opens address page
    And clicks on Delete button
    Then Second address is deleted
    And user signs out

    Examples:
      | Username           | Password   |
      | testing01@mine.com | billyjones |
      | testing02@mine.com | billyjones |
      | testing03@mine.com | billyjones |
      | testing05@mine.com | billyjones |
      | testing06@mine.com | billyjones |
