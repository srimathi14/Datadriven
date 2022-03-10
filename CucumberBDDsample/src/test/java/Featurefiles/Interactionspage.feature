Feature: verifying Interactionpage Functionality

  Background: Launch Application
    Given user launch tooldemo application "https://demoqa.com/"

  Scenario: Verifying Sortable Functionality

    When user click the Interaction functionality tab
    And user click the sortable functionality
    Then user should be able to perform list tab functions
    And user should be able to move to grid tab


  Scenario: Verifying Selectable Functionality

    When user click the Interaction functionality tab
    And user click the selectable functionality
    Then user should be able to click list tab
    And user should be able to move to and click grid tab

  Scenario: Verifying Resizable Functionality

    When user click the Interaction functionality tab
    And user click the Resizable functionality
    Then user should perform the resizing the box functionality

  Scenario: Verifying Droppable Functionality

    When user click the Interaction functionality tab
    And user click the Droppable functionality
    Then user should be navigated to Droppable functionality page
    And user should be able to select the simple functionality
    Then user should be able to perform drag and drop functionality
    Then user should click accept tab
    And user should be able to  drag the source box acceptable to drop here target box
    And user should be able to drag the not acceptable source to the drophere target box
    Then user should be able to move on next tab and click prevent propagation
    And user should be able to drag the source element to the inner target box
    And user should be able to drag the source element to the outer droppable box
    Then user should be move on to tne next tab and click Revert Draggable
    And user should be able to drag the source element to the target element

  Scenario: : Verifying Dragabble Functionality

    When user click the Interaction functionality tab
    And user click the Dragabble functionality
    Then user should be navigated to Dragabble functionality page
    And user should be able to select the simple functionality tab
    And user should be able to perform drag functionality