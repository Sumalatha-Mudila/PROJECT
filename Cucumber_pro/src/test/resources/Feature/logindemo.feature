Feature:Test login functionality
Scenario Outline: check login is successful with

Given browser is open on google
And user is on google search page with user
When user enters <username> and <password>
And user clicks on login
Then user is navigated to home page