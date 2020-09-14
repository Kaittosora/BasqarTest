Feature: HR Salary

  Background:
    Given Navigate to basqar
    When Enter the username and password and click on login button
    Then User should login successfully
    And Navigate to Human Resources page

  Scenario: : Successfully creation of a Salary Type
    And Navigate to Salary Type
    When User create a salary type as "My Salary Type"
    Then Success message should be displayed

  Scenario: : Successfully edit of a Salary Type
    And Navigate to Salary Type
    When User edit "My Salary Type" to "Your Salary Type"
    Then Success message should be displayed

  Scenario: : Successfully deletion of a Salary Type
    And Navigate to Salary Type
    When User delete "Your Salary Type"
    Then Success message should be displayed

  Scenario: : Successfully creation of a Salary Constant
    And Navigate to Salary Constant
    When User create a salary constant as "My Salary Constant"
    Then Success message should be displayed

  Scenario: : Successfully edit of a Salary Constant
    And Navigate to Salary Constant
    When User edit Salary Constant of "My Salary Constant" to "Your Salary Constant"
    Then Success message should be displayed

  Scenario: : Successfully deletion of a Salary Constant
    And Navigate to Salary Constant
    When User delete "Your Salary Constant"
    Then Success message should be displayed

  Scenario: : Successfully creation of a Salary Modifier
    And Navigate to Salary Modifier
    When User create a salary modifier as "My Salary Modifier"
    Then Success message should be displayed

  Scenario: : Successfully edit of a Salary Modifier
    And Navigate to Salary Modifier
    When User edit description of "My Salary Modifier" to "Your Salary Modifier"
    Then Success message should be displayed

  Scenario: : Successfully deletion of a Salary Modifier
    And Navigate to Salary Modifier
    When User delete "Your Salary Modifier"
    Then Success message should be displayed