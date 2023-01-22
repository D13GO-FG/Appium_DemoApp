@SmokeLogin
Feature: Login
  As a user
  I want to be able to log in to the application
  So that I can access the catalog page
Background:
  Given The user is on the login page

  Scenario: Successful login with correct credential
    When The user input an username "bob@example.com"
    And The user input an password "10203040"
    When The user click the login button
    Then The user should be directed to the catalog page

  Scenario Outline: Unsuccessful login with incorrect credentials
    When The user input an username "<username>"
    And The user input an password "<password>"
    When The user click the login button
    Then I should see an error message "<errorMessage>"
    Examples:
      | username          | password | errorMessage |
      | alice@example.com | 10203040 |      Sorry, this user has been locked out.        |
      | bob@example.com   | 10203041 |        Provided credentials do not match any user in this service.      |