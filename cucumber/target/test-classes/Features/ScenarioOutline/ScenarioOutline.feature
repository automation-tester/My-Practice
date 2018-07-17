Feature: Gmail login page with scenario outline

Scenario Outline: user checks the login page functionality using scenario outline
Given user opens browser and launches gmail "<url>" 
When user navigated to the page 
Then user enters "<username>"
And clicks on next link
Then user enters "<password>" password
And user closes the browser

Examples:
| url 									| username 							| password 	|
|	https://www.gmail.com |	onlinedatauser10 			| Gkgs@1992 |
|	https://www.gmail.com |	harishyed91@gmail.com | bhagyamma	|