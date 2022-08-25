Feature: Application Login
@Smoke
Scenario: Home Page Default login
Given user is in landing page
When User logged in to application with "Bitteswar" and password "password1"
Then Home page is populated
And pages are displayed "true"
@Regression
Scenario: Home Page Default login 2
Given user is in landing page
When User logged in to application with "Bitteswar1" and password "password2"
Then Home page is populated
And pages are displayed "false"
@Smoke @Regression
Scenario: Home Page Default login 3
Given user is in landing page
When User enters data with following details
| bitteswar | 39 | bitteswar@gmail.com | Janapriya |
Then Home page is populated
And pages are displayed "false"
@Sanity @Smoke
Scenario Outline: Home Page Default login 4   //Scenario Outline as Data parameterization with example has been used
Given user is in landing page
When User enters data with following <UserID> and <password>
Then Home page is populated
And pages are displayed "false"
Examples:
|UserID |password|
|user1  |pass1|
|user2  |passw2|
|user3  |pass3|
|user4  |pass4|
