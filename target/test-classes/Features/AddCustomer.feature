#Author: your.karthi@your.domain.com
Feature: Add Customer

Background:
    Given user launches telecom application
    And user click on add customer button

  Scenario: Validate add customer module
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Validate add customer module
    When user need to fill up the fields by one dim list
      | Java | Selenium | java@gmail.com | Oracle | 8787987987 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Validate add customer module
    When user need to fill up the fields by one dim map
      | fname | fayas           |
      | lname | ahmed           |
      | mail  | fayas@gmail.com |
      | addr  | pvi             |
      | phno  |          545322 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Validate add customer module
    When user need to fill up the fields by two dim list
      | Java1 | Selenium  | java@gmail.com | Oracle | 8787987987 |
      | Java2 | Selenium2 | java@gmail.com | Oracle | 8787987987 |
      | Java3 | Selenium3 | java@gmail.com | Oracle | 8787987987 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Validate add customer module
    When user need to fill up the fields by two dim map
      | FN    | LN        | ML             | AD     | PH         |
      | Java1 | Selenium  | java@gmail.com | Oracle | 8787987987 |
      | Java2 | Selenium2 | java@gmail.com | Oracle | 8787987987 |
      | Java3 | Selenium3 | java@gmail.com | Oracle | 8787987987 |
    And user click on submit button
    Then user verify customer id is generated
