@User_Story_5
Feature: Student signs up with an access code

  Scenario: As a un-registered user with given access code PVTWZ-GDCRN, I want to sign up as a student for schoology.
    Given User is on schoology home page and clicks Sign Up
    When User clicks Student
    And User enters access code "PVTWZ-GDCRN"
    And user clicks Continue
    And User enters first.name "Captain"
    And user enters last name "America"
    And user enters email address "captainamerica@gmail.com"
    And user enters password "1234"
    And user confirms password "1234"
    And user selects birth month "December"
    And user selects birthday "13"
    And user selects year "1919"
    Then user asserts Register button is clickable
