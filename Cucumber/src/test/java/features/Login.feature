Feature: Application Login

Scenario: HomePage displayed on default logging in
Given The user is on the Netbanking landing page
When The user logs into the application with username and password
Then HomePage should be displayed
And The user should be able to see all the cards