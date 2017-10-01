Feature: This application displays the 5 day weather forecast for a given location


  Scenario Outline: 1.User enters city name and gets 5 days weather forecast
    Given I am an authenticated user
    When I make a forecast request for city using id "<id>" and apiid "<api-key>"
    Then I should get a valid response "<response-code>" using id "<id>" and apiid "<api-key>"
    And Forecast for city with id "<id>" and apiid "<api-key>" is for "<days>" days

    Examples:
      | id      | response-code | api-key                           | days |
      | 2657832 | 200           | b1b15e88fa797225412429c1c50c122a1 | 5    |
      | 2650225 | 200           | b1b15e88fa797225412429c1c50c122a1 | 5    |
      | 2648579 | 200           | b1b15e88fa797225412429c1c50c122a1 | 4    |
      | 2640358 | 200           | b1b15e88fa797225412429c1c50c122a1 | 5    |
      | 2636910 | 200           | b1b15e88fa797225412429c1c50c122a1 | 5    |
      | 2650752 | 200           | b1b15e88fa797225412429c1c50c122a1 | 6    |

  Scenario Outline: 2. Select day, get 3 hourly forecast
    Given I am an authenticated user
    When I make a forecast request for city using id "<id>" and apiid "<api-key>" for "<no-of-days>" days
    Then I should get a "<three-hour>" hourly forecast
    When I select a day again
    Then I hide a three hourly notice

    Examples:
      | id      | api-key                           | no-of-days | three-hour |
      | 2650225 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          |
      | 2648579 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          |
      | 2640358 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          |
      | 2636910 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          |
      | 2650752 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          |
      | 2657832 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          |

  Scenario Outline: 3.Daily forecast should summarise the 3 hour data
    Given I am an authenticated user
    When I make a forecast request for city using id "<id>" and apiid "<api-key>" for "<no-of-days>" days
    Then I should get a "<three-hour>" hourly forecast
    And  Daily forecast should summarise three hour data for "<condition>"
    And All value will be rounded up

    Examples:
      | id      | api-key                           | no-of-days | three-hour | condition |
      | 2650225 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          | temp      |
      | 2648579 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          | rain      |
      | 2640358 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          | pressure  |
      | 2636910 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          | humidity  |
      | 2657832 | b1b15e88fa797225412429c1c50c122a1 | 1          | 3          | min       |

