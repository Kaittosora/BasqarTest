Feature: Report

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Reports Excel Template

  Scenario: : Successfully creation of a Excel Template
    When User create an excel template as "My Excel Template"
    Then Success message should be displayed

  Scenario: : Successfully edit of a Excel Template
    When User edit "My Excel Template" to "Your Excel Template"
    Then Success message should be displayed

  Scenario: : Successfully deletion of a Excel Template
    When User delete "Your Excel Template"
    Then Success message should be displayed
