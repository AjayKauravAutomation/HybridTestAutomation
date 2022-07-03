Feature: Test Web Test

	@Scenario1
  Scenario: Verify the JQueryControlGroups
    Given user launches application
    When user verifies ControlGroups
    Then close the browser
    
  @Scenario2
  Scenario: Verify the Droppable
    Given user launches the application
    When user verifies Drag me to my target component to Drop here component
    Then user close the browser
  @Scenario3
  Scenario: Verify the Selectable
    Given user launche the application
    When user select Item 1, Item 3, Item 7 
    Then user close the chrome browser