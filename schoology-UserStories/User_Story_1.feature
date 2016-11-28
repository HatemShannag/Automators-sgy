@User_Story_1
Feature: An unregistered user should be able to request a tour as a corporation.

  Scenario: User will be able to request information by clicking Corporate on the Home Page and fill out the form
    Given User is on schoology home page
    When User clicks on corporate and is on corporate page
    When user enters first name "Captain"
    And User enters last name "America"
    And User selects job function "VP"
    And User enters phone number "012-345-6789"
    And User enters email address "CaptainAmerica@gmail.com"
    And User enters company "Marvel"
    And User selects number of employees "1 - 500"
    And User chooses country "United States"
    And User enters comment "I am a beast in automation"
    Then User asserts submit button is clickable
