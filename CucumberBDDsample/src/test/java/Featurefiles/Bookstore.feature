Feature: Verifying Bookstore functionality

  Background: Launch Application
    Given user launches the application "https://demoqa.com/"
 @bookstore
  Scenario Outline: Verifying New user login functionality
    When user clicked on bookStore page
    Then user clicked on loginbutton
    Then user clicked the new user
    Then user should be able to enter firstname1 "<firstname1>"
    Then user  should be able to enter lastname "<lastname>"
    Then user should be able to enter the username "<username>"
    Then user should be able to enter the password "<password>"
    Then user checks the captcha image
    Then user clicks the register button and it should be able to register

    Examples:
      | firstname1 | lastname  | username | password    |
      | selenium  | webdriver | book     | bookstore@1 |
      | java      | python    | cucumber | bdd         |

  Scenario: Verifying login functionality
    When user clicked on bookStore page
    Then user clicked on loginfunction
    Then user should be able to enter the usernamenew "book"
    Then user should be able to enter the password "Bookstore@1
    Then user should be able to click the login
    Then user should be able to click logout

  Scenario: Verifying Bookstore functionality
    When user clicked on bookStore page
       
