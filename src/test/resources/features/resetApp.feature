@SmokeResetApp
Feature: Reset App
  As a user
  I want to be able to reset the app
  So that I can start fresh with the application
Background:
  Given The user is in Catalog
  When The user open the left menu of options
  And The user clicks the reset option
  When The user looks at the reset confirmation pop-up "Reset App State"
  Scenario: Successful reset app
    And The user clicks the reset app button
    And The user clicks OK on the confirmation pop-up "App State has been reset."
    Then The user returns to left menu

  Scenario: Cancel reset app
    And The user clicks the cancel button
    Then The user returns to left menu