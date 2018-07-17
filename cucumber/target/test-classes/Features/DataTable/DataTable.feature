Feature: Gmail login page with datatable

Background:
Given user opens browser and launches gmail url
When user navigated to the page


Scenario: Checking the display of username textbox 
Then user verifies the username text box display and enter username
|username| onlinedatauser10|
And user closes the browser
	

Scenario: Checking the display of password textbox
Then user verifies the username text box display and enter username
|username| onlinedatauser10|
And clicks on next link
Then user verifies the password text box display and enter password
| Gkgs@1992|
And user closes the browser