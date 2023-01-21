Feature: Drawing functionality
  As a user
  I want to be able to draw on a canvas
  So that I can save and clear my drawings
  @SmokeDrawing
  Scenario: Draw and save a circle on canvas
    Given The user is on the drawing page
    When The user opens the drawing page
    And The user draws a circle on the canvas
    And The user clicks on the Save button
    Then The drawing should be saved
    And When the user clicks on the Clear button
    Then The canvas should be cleared