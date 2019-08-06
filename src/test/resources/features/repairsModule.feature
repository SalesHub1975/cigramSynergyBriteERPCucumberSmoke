@smoke @repairsModule
Feature: Repair Module
#  USER STORY - CS 72

  Background: User logs in as a manager and goes to repairs module main page
    Given user goes to login page
    When user logs in as a manager
    And user clicks on the repairs module button

  @repairsMainPage
  Scenario: Verify Repair Module Main Page
    Then user should be able to see "Repair Orders" in the page title


  @importButtonVerification
  Scenario: Verify import button
    Given user is on the repairs module main page
    When user verifies import button is displayed
    And user clicks import button
    Then user should verify that page header contains "Import a File"


  @helpButtonVerification
  Scenario: Verify Help button
    Given user is on the repairs module main page
    When user clicks import button
    And user clicks on help  button
    Then user should be able verify if the current url matches with the expected url

  @columnNamesVefirication
  Scenario Outline: Table Content Verification
    When user is on the repairs module main page
    Then user should be able to verify that column "<number>" has "<name>"

    Examples: test data to verify column names
      | number | name                |
      | 1      | Repair Reference   |
      | 2      | Product to Repair   |
      | 3      | Customer            |
      | 4      | Delivery Address    |
      | 5      | Warranty Expiration |
      | 6      | Status              |


    @searchBoxVerification
    Scenario: Search Box verification
      Given  user is on the repairs module main page
      When user verifies search box is displayed
      And user clicks on +(plus) button
      Then user should be able to see three popped up buttons: Filters, Group by, Favorites

