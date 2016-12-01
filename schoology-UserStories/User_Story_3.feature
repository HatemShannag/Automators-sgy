@User_Story_3
Feature: As an unregistered user, I want to navigate to the blog and filter blog posts by Community

  Scenario: User will be able to click on blog and have community results filtered
    Given User is on schoology web application
    When User clicks Blog and is on Blog page
    And User clicks Community tab
    Then community results are displayed
