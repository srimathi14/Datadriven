Feature: Verifying Bookstore functionality

  Background: Launch Application
    Given user launches the application "https://demoqa.com/"

    Scenario: Verifying New user login functionality
      When user clicked on bookStore page
      Then user clicked on loginbutton
      Then user clicked the new user
      Then user should be able to enter the firstname,lastname,username and password
          |
      Then user checks the captcha image
      Then user clicks the register button and it should be able to register

      Scenario: Verifying login functionality
        When user clicked on bookStore page
        Then user clicked on newUser
        Then user should be able to enter the username "book"
        Then user should be able to enter the password "Bookstore@1
        Then user should be able to click the login
        Then user should be able to click logout

        Scenario: Verifying Bookstore functionality
          When user clicked on bookStore page
       
