Feature: verifying  form functionality

  Background: Launch Application
    Given User launches application "https://demoqa.com/"

    @verifyForms
  Scenario Outline: verifying practice form functionality

    When user clicked on Formspage
    And user clicked on practice forms
    Then user should be able to enter firstname "<FirstName>"
    And user enter lastname "<LastName>"
    And user enter email "<Email>"
    And user clicks on  genderbutton
    And user enter mobilenumber "<MobileNumber>"
    And user click on currentdatecal
    And user enter subjects "<Subject>"
    And user checked the hobbies
    And user enter current address "<Address>"
    And user enter select city
    Then user should be able to submit the application

    Examples:
      | FirstName | LastName | Email         | MobileNumber | Subject  | Address |
      | selenium  | java     | abc@gmail.com | 13878665     | cucumber | kjsjdh  |
      | C++       | python   | ask@gmail.com | 123456       | BDD      | hgfdd   |
