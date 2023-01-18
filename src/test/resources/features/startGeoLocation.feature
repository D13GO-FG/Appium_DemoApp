Feature: Geolocation functionality
  As a user
  I want to be able to access and use the geolocation feature of the device
  So that I can see my current location

  @SmokeGeoLocation
  Scenario: Access and use geolocation feature
    Given The user opens the geolocation page
    Then The latitude and longitude should be different from "0"
    When The user clicks on the Stop Observing button
    And The user clicks on the Start Observing button
    Then The geolocation should be updated and displayed on the page