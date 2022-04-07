Feature: Authentication

  Scenario: with correct username and wrong password 

Given I visit the-internet.herokuapp.com/login
  When I enter user in the user name correct
   And I enter user in the password field
   And I press the login button
  Then I should see the Your username is invalid!
  
   