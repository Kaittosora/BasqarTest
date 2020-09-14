Feature: Budget

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Budget Page

  Scenario: Successfully Created A Budget Groups
    Given I navigate to Budget Groups screen
    When  I create a Budget Groups name as "Total Expenses"
    And I add a start date as the choosen date
    And I add a finish date as the choosen date
    And I add a comment as a "Comment"
    And I click the save Button
    Then Success message should be displayed

  Scenario: Successfully Edit A Budget Group
    Given I navigate to Budget Groups screen
    When User edit "Total Expenses" to "Total Expenses1" and "Comment" to "Comment1"
    Then Success message should be displayed

  Scenario: Successfully Delete A Budget Group
    Given I navigate to Budget Groups screen
    When  User delete "Total Expenses1"
    Then Success message should be displayed

  Scenario: : Successfully creation of a Cost Center
    And Navigate to Cost Center
    When User create a cost center as "My Cost Center" with code "myCode001"
    Then Success message should be displayed

  Scenario: : Successfully edit of a Cost Center
    And Navigate to Cost Center
    When User edit "My Cost Center" to "Your Cost Center"
    Then Success message should be displayed

  Scenario: : Successfully deletion of a Cost Center
    And Navigate to Cost Center
    When User delete "Your Cost Center"
    Then Success message should be displayed