Feature: Gmail login page 

Scenario: Checking the display of username textbox
Given user opens browser and launches gmail url
When user navigated to the page 
Then user verifies the username text box display and enter username
And user closes the browser
	

Scenario: Checking the display of password textbox
Given user opens browser and launches gmail url
When user navigated to the page 
Then user verifies the username text box display and enter username
And clicks on next link
Then user verifies the password text box display and enter password
And user closes the browser