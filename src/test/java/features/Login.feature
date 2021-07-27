
Feature: Application Login

  Scenario: Home Page default Login
  Given User is on Netbanking login page
  When User is  login into application with username and password
  Then Home page is populated
  And Card is displayed
  
