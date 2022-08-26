@smoketest
Feature: Feature to test login functionality
  I want to use this template for my feature file

  @smoketest
  Scenario: Check login is succesful with valid credentials
    Given user is launched application on chrome
    And user is on login page
    When when user enters username and password
    And clicks on login button
    Then user is navigated to the home page
