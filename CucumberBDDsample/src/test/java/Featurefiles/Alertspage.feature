Feature: verifying Alert,Frames Functionality

Scenario:  Veryfying browser window functionality

	Given  user launch application "https://demoqa.com/"
 	When user clicked on alert,frames and windows tab
 	And user clicked on browse
 	And user clicked on newTab
	Then user clicked on newwindow

	Scenario: verify Alerts functionality
		Given user launch application "https://demoqa.com/"
		When user clicked on alert,frames and windows tab
		And user clicked on Alerts tab
		Then user should be able to  click button to see window and manage alerts by clicking ok
		Then user should be able to check alert that appears for 5 seconds
		Then user should be able to click the button and view confirm box
		Then user should be able to click button and view prompt box "prompt"

	Scenario: Verify Frames Functionality
		Given  user launch application "https://demoqa.com/"
		When user clicked on alert,frames and windows tab
		And user clicked on Frames tab
		Then user should be able to switch to frames and display the text inside frame

	Scenario: Verifying Nested Frames Functionality
		Given user launch application "https://demoqa.com/"
		When user clicked on alert,frames and windows tab
		And user clicked on Nested Frames tab
		Then user should be able to switch to parent frame display the text inside parent frame
		Then user should be able to switch from parent frame to child frame and display the text inside child frame

	Scenario: Verifying Modal Dialogs
		Given user launch application "https://demoqa.com/"
		When user clicked on alert,frames and windows tab
		And user clicked on Modal Dialogs tab
		Then user should be able to click small modal button
		Then user should be able to click large modal button