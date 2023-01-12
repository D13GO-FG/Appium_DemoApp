Feature: Add catalog element to card

  As a user
  I want to be able to add elements of a catalog to a card
  So that I can keep track of the items I am interested in
  @SmokeTest
  Scenario: Add an element to a card
    When The user selects an element
    And Clicks on the Add to card button
    Then The element should be added to the user's card