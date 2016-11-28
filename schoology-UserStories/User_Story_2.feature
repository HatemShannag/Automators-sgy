@User_Story_2
Feature: As an unregistered user, I want to navigate to resources and filter resources by Research type.

  Scenario: Filter resources by Research type
    Given User is on schoology landing page
    When User clicks resources tab and is on resources page
    And User checks Research box under Type header
    Then research results are displayed
