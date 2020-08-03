Feature: Application login
Scenario: User is on Home page default
Given User is on netbanking landing screen
When User enters username "john" and passowrd "3456" into application
Then User lands on home page
And cards are displayed


Scenario: User is on Home page default
Given User is on netbanking landing screen
When User enters username "jin" and passowrd "1234" into application
Then User lands on home page
And cards are not  displayed
