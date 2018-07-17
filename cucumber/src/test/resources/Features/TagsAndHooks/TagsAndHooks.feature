Feature: Gmail login page with tags and hooks

@smoke @regression
Scenario Outline: user checks the login page functionality using scenario outline
Then user enters "<username>"
And clicks on next link
Then user enters "<password>" password

Examples:
| username 							| password 	|
|	onlinedatauser10 			| Gkgs@1992 |
|	harishyed91@gmail.com | bhagyamma	|


@smoke
Scenario: Checking the display of username textbox 
Then user enters "onlinedatauser10"
And user closes the browser
	

@regression
Scenario: Checking the display of password textbox
Then user enters "onlinedatauser10"
And clicks on next link
Then user enters "Gkgs@1992" password
