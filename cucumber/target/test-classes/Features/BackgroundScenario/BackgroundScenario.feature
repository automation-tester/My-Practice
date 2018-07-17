Feature: Gmail login page using Background 

Background:
Given user opens browser and launches gmail url
When user navigated to the page 

Scenario: Checking the display of username textbox
Then user enters "onlinedatauser10"
And user closes the browser
	

Scenario: Checking the display of password textbox 
Then user enters "onlinedatauser10"
And clicks on next link
Then user enters "Gkgs@1992" password
And user closes the browser
