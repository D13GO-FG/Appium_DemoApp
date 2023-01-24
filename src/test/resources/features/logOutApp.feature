@SmokeLogOut
Feature: Logout
  As a user
  the user wants to be able to log out of the application
  So that user can exit his session securely
Background:
  Given The user is in Catalog
  When The user open the left menu of options
  And The user clicks the logout option
  When The user looks at the logout confirmation pop-up "Log Out"
  Scenario: Successful logout
    And The user clicks the logout button
    And The user clicks OK on the confirmation pop-up "You are successfully logged out."
    Then The user should be logged out

  Scenario: Cancel logout
    And The user clicks the cancel button
    Then The user returns to left menu