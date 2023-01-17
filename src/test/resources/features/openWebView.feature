Feature: Navigate to a website in a WebView

  As a user
  I want to be able to navigate to a website in a WebView
  So that I can use the website's functionality within my app
  @SmokeTestWebView
  Scenario: Navigate to a website in a WebView
    Given The user is on the home screen
    When The user clicks on the burger button
    And Clicks on the WebView option
    And Inserts the URL "https://www.google.com.mx" into the input field
    And Clicks on the Go to site button
    Then The website should be displayed in the WebView
    And The user inserts "hello world" in the google page
    And Clicks on the search button
    Then The search results should be displayed