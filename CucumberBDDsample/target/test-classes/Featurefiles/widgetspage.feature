Feature: Verifying Widgetspage functionality

  Background: Launch Application
    Given user launches application "https://demoqa.com/"

  Scenario: Verifying Accordian Functionality
    When user clicked on widgetstab
    When user clicked on accordian tab
    Then user should be able to click what is loper ipsum
    And user should be able to click where does it come from
    And user should be able to click why do we use it

  Scenario: Verifying autoComplete Functionality
    When user clicked on widgetstab
    When user clicked on autoComplete tab
    Then user should be able to enter multiple colors
    Then user should be able to enter single input color

  Scenario: Verifying Date Picker functionality
    When user clicked on widgetstab
    When user clicked on datepicker
    Then user should be able to select date
    Then user should be able to select date and time

  Scenario: Verifying slider functionality
    When user clicked on widgetstab
    When user clicked on slider
    Then user should be able to move the slider

  Scenario: Verifying progressbar functionality
    When user clicked on widgetstab
    When user clicked on progressbar
    Then user should be able to start and stop the progressbar

  Scenario: Verifying tab functionality
    When user clicked on widgetstab
    Then user clicked on tab and move to different tabs

  Scenario: Verifying tooltip functionality
    When user clicked on widgetstab
    When user clicked on tooltip
    Then user should be able to mousehover the element and get text

  Scenario: Verifying Menu functionality
    When user clicked on widgetstab
    When user clicked on Menu
    Then user should be able to mousehover the different element tabs

  Scenario: Verifying selectMenu functionality
    When user clicked on widgetstab
    When user clicked on selectMenu
    Then user should be able to select the menu from old style selectMenu