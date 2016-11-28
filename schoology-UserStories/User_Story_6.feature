@User_Story_6


Feature: Registered user signs up for new course with new access code
Scenario: As a registered user with given access code 66HDP-N2H84, I want to sign up for a different course.

Given User is on schoology web application and clicks Log In button
When User enters username "automatorsselenium@gmail.com"
And User enters password "AutomationClass"
And User clicks Continue
When User clicks Courses
And User clicks Join
And user enters access code "66HDP-N2H84"
Then User asserts Join button




