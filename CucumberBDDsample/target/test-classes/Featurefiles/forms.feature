Feature: verifying  form functionality

  Scenario: verifying practice form functionality
    Given User launches application "https://demoqa.com/"
    When user clicked on Formspage
    And user clicked on practice forms
    Then user should be able to enter firstname "selenium"
    And user enter lastname "java"
    And user enter email "abc@gmail.com"
    And user clicks on  genderbutton
    And user enter mobilenumber "13878665"
    And user click on currentdatecal
    And user enter subjects "cucumber"
    And user checked the hobbies
    And user enter current address "kjsjdh"
    And user enter select city
    Then user should be able to submit the application
