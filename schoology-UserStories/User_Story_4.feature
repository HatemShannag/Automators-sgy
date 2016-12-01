@User_Story_4

Feature: As an unregistered user, I want to contact Schoology regarding a media inquiry.

Scenario: User will make a media inquiry.

Given User is on schoology home page and clicks About.
When User clicks Contact
And User selects "Media inquiry" from dropdown
And user enters first_name "Captain"
And user enters last_name "America"
And user enters Email "CaptainAmerica@gmail.com"
And user enters phone_number "12345678"
And user enters Institution "Automation"
And user enters job_title "Automation Engineer"
Then User asserts submit button
