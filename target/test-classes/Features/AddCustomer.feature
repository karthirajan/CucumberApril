#Author: your.karthi@your.domain.com
Feature: Add Customer

  Scenario: Validate add customer module
    Given user launches telecom application
    And user click on add customer button
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated
