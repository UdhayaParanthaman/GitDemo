
Feature: As a MakeMyTrip user I should be able to login with valid credentials


  Scenario: Login into the application with valid credentials
    Given I am on the Login page URL 
    When click on login button
    Then give valid Credentials "uk1792692@gmail.com" and "Welcome@123" for logged in 

  