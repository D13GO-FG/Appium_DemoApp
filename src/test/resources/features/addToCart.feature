Feature: Add catalog element to card

  As a user
  I want to be able to add elements of a catalog to a card
  So that I can keep track of the items I am interested in
  @SmokeTest
  Scenario Outline: Add an element to a card
    When The user selects an element
    And Clicks on the Add to card button
    Then The element should be added to the user's card
    And The user clicks Proceed To Checkout button
    When The user input an username "bob@example.com"
    And The user input an password "10203040"
    When The user click the login button
    Then The user types Full Name "Diego Flores"
    And The user types Address one "Valle Lejos 1212"
    And The user types Address two "Villa Far Far away 2"
    And The user types City "Tijuana"
    And The user types State "Baja California"
    And The user types Zip Code "12345"
    And The user types Country "Mexico"
    Then The user clicks To Payment
    When The user types Full Name "<fullName>"
    And The user types Card Number "<cardNumber>"
    And The user types Expiration Date "<ExpDate>"
    And The user types Security Code "<SecurityCode>"
    Then The user clicks Review Order button
    And The user clicks Place Order button
    Then The user sees Checkout Complete

    Examples:
      | fullName          | cardNumber      | ExpDate | SecurityCode |
      | Diego Flores      | 111111111111111| 0325    |  111         |


