Feature: Handeling the window
Need to handel the different window

Background: moving to the demo page
       Given user navigate to the main page
        When user navigate to the demosite 
       And clciked on the automation practice window
       
Scenario: hadndling the  new Browser window
     Given user is home page
     Then user will be on the Automation Practice Switch Windows page
     And User will handel the new browser window
     
Scenario: Handeling the new message window
     Given user is home page
     Then clciked on the new mesage window
     And handeled the new message window
     
Scenario: Handeling the new browser tab
    Given user is home page
    When clicked on the new browser tab
    Then performed some function on the browser tab
    And coming back to mainWindow
      
Scenario: Handeling the alert
    Given user is home page
    When clicked on the alert box
    Then then handeling the alert   

