@Regression
Feature: Sign in Feature

  @Regression
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name     | email                      | password  | confirmPassword |
      | studentH | newStudentHhp@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page

  @Regression
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'newStudentHS@tekschool.us' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account
