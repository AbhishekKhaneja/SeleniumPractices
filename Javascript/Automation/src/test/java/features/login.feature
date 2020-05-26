Feature: Application login

Scenario: Home Page default Login
Given User is on landing Page
When User login into application with Username and password
Then Homepage is Populated
And cards are displayed 