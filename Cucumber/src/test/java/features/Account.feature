Feature: Application Login

@RegTest
Scenario: HomePage displayed on default logging in for normal user
Given The user is on the Netbanking landing page
When The user logs into the application with "vkkf" and "2352654"
Then HomePage should be displayed
And Cards displayed are "true"

@SanityTest
Scenario: HomePage displayed on default logging in for signup details
Given The user is on the Netbanking landing page
When The user signs up with the following details
|kris22hna|prasa22th|12-02-1999|ab256c@gmail.com|582567596|
Then HomePage should be displayed
And Cards displayed are "false"


