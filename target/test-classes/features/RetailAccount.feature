
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'newStudentHS@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @RetailPage @Regression
  Scenario: Verify User can update Profile Information
    And User update Name 'HusniaSi' and Phone '202-642-7774'
    And User click on Update button
    Then user profile information should be updated
@RetailPage @Regression
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5174125678907140 | Husnia     |               6 |           2023 |          211 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’
@RetailPage @Regression
  Scenario: Verify User can edit Debit or Credit card
    And User click on Card to Eidt
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4350935761098220 | Husnia     |               5 |           2023 |          010 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

@RetailPage @Regression
  Scenario: Verify User can remove Debit or Credit card
    And User click on Card to remove
    And User click on remove option of card section
    Then payment details should be removed
@RetailPage @Regression 
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber  | streetAddress     | apt   | city        | state   | zipCode |
      | United States | Sara     | 202-666-0903 | 3236 avneu street | value | wooddbridge | Alabama |   22191 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’
@RetailPage @Regression
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill  edit address form with below information
      | country       | fullName   | phoneNumber  | streetAddress     | apt   | city        | state   | zipCode |
      | United States | Sara Ahmad | 202-555-0102 | 3235 avneu street | value | wooddbridge | Alabama |   22191 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully
@RetailPage @Regression
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
