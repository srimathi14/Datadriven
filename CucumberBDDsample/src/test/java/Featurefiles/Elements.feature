@testVerifyElement
Feature: Verifying Elementspage functionality

  Background: Launch Application
    Given user launch application "https://demoqa.com/"

  @veryTextPage
  Scenario: Verifying Textpage functionality

    When user clicked on Elementspage
    And user clicked on textbox
    And user should be able to type name
    |name|lastname|
    |java|goyal   |
    |abcd|sjaxas  |

    And user should be able to type email "ask@gmail.com"
    And user should be able to type current address "ajnxas"
    And user should be able to type permanent address "permanentAddress"
    Then user should be able to submit and view their details


  @veryTextPage
  Scenario: Verifying checkbox functionality

    When user clicked on Elementspage
    And user clicked on checkbox
    And user should be able to check the home checkbox
    And user should be able to click on icon button
    And user should be able to click on desktop button
    Then user should be able to select notecheck checkboxes

  Scenario: verifying radio button

    When user clicked on Elementspage
    And user clicked on Radio button
    And user should be able to click the radio button

  Scenario: verifying webtable

    When user clicked on Elementspage
    And user clicked on webtable
    And user should be able to edit the table "framework"

  Scenario: verifying buttons

    When user clicked on Elementspage
    And user clicked on buttons
    And user should be able to click on singlebutton


  Scenario: verifying links

    When user clicked on Elementspage
    And user clicked on links
