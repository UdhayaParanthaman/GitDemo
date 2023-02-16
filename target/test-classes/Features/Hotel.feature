
@tag
Feature: We have to book Hotel

  @tag1
  Scenario: want to check for a location or city
   Given I want to land on the hotel page
    When click on the country name or location
    Then I validate the outcomes
    
    
   @tag2
   Scenario: want to select date for Hotel booking
    Given click on the check in button
    When  have to select the check in date
    Given click on the check Out button
    When  have to select the check Out date
    Then I validate the outcomes
    
 

