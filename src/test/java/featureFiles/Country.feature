Feature: Country

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Parameters

  Scenario: : Successfully creation of Country
    And Navigate to Country
    When User create "Liechtenstein" with code "code001"
    Then Success message should be displayed

  Scenario: : Successfully creation of City
    And Navigate to City
    When User create city "Vaduz" and choose "Liechtenstein" as a country
    Then Success message should be displayed

  Scenario: Negative Testing of Delete function of Country
    And Navigate to Country
    When User delete "Liechtenstein"
    Then Error message should be displayed

  Scenario: Testing of Delete function of City
    And Navigate to City
    When User delete "Vaduz"
    Then Success message should be displayed

  Scenario: Testing of Delete function of Country
    And Navigate to Country
    When User delete "Liechtenstein"
    Then Success message should be displayed
