@SmokeQRCodeScanner
Feature: Scan QR Code
  As a user
  I want to be able to scan a QR code
  So that I can open a URL in a browser
  Scenario: Successful scanned QR code
    Given The user is in Qr Code Scanner view
    When The camera is open and look at QR
    Then The user sees browser with url "saucedemo.com"