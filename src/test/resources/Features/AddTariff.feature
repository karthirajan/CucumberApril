#Author: your.email@your.domain.com
Feature: Add tariff Validation

  Scenario Outline: Add tariff scenario validation
    Given User launch telecom application
    And user click on add tariff button
    When user enters plan details "<MR>","<FLM>","<FIM>","<SMS>","<LPMC>","<IPMC>","<SMSC>"
    And user click on submit buttons
    Then user validate congrats message

    Examples: 
      | MR  | FLM | FIM | SMS | LPMC | IPMC | SMSC |
      | 100 | 200 | 300 | 400 |    1 |    2 |    3 |
      | 200 | 200 | 300 | 400 |    1 |    2 |    3 |
      | 300 | 200 | 300 | 400 |    1 |    2 |    3 |
      | 400 | 200 | 300 | 400 |    1 |    2 |    3 |
