# Test Automation Framework for Android App
### Using:
- Appium
- Selenium
- Java 8
- Cucumber to BDD
- TestNG

## Test Cases
1. View Catalog
````
Feature: Add catalog element to card
    As a user
    I want to be able to add elements of a catalog to a card
    So that I can keep track of the items I am interested in
@SmokeTest
    Scenario: Add an element to a card
        When The user selects an element
        And Clicks on the Add to card button
        Then The element should be added to the user's card
````

|                     Catalog View                      |                     Product View                      | Cart View                                             |
|:-----------------------------------------------------:|:-----------------------------------------------------:|:------------------------------------------------------|
| ![Catalog_1](src/main/resources/images/Catalog_1.png) | ![Catalog_2](src/main/resources/images/Catalog_2.png) | ![Catalog_3](src/main/resources/images/Catalog_3.png) |

2. View WebView
````
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
````
|                        WebView                        | Google Search                                         |
|:-----------------------------------------------------:|:------------------------------------------------------|
| ![WebView_1](src/main/resources/images/WebView_1.png) | ![WebView_2](src/main/resources/images/WebView_2.png) |

3. View Geo Location
````
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
````
|                     Geo Location View                     |
|:---------------------------------------------------------:|
| ![GeoLocation](src/main/resources/images/GeoLocation.png) |

4. View Drawing
````
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
````

|                     Drawing View                      |                   Drawing a sketch                    |                Save Pop Up to verifier                |
|:-----------------------------------------------------:|:-----------------------------------------------------:|:-----------------------------------------------------:|
| ![Drawing_1](src/main/resources/images/Drawing_1.png) | ![Drawing_2](src/main/resources/images/Drawing_2.png) | ![Drawing_3](src/main/resources/images/Drawing_3.png) |

5. Login Page
````
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
````
### Scenario: Successful login with correct credential
|                    Login View                     |              Input username and pwd               |                As a result display                |
|:-------------------------------------------------:|:-------------------------------------------------:|:-------------------------------------------------:|
| ![Login_1](src/main/resources/images/Login_1.png) | ![Login_2](src/main/resources/images/Login_2.png) | ![Login_3](src/main/resources/images/Login_3.png) |

### Scenario Outline: Unsuccessful login with incorrect credentials
|                    Locked out                     |                 Wrong credentials                 |
|:-------------------------------------------------:|:-------------------------------------------------:|
| ![Login_4](src/main/resources/images/Login_4.png) | ![Login_5](src/main/resources/images/Login_5.png) |

6. LogOut Page
````
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
````
|                    Logout option                    |                 Pop up with options                 |               Pop up with success msg               |                 Logout Final Screen                 |
|:---------------------------------------------------:|:---------------------------------------------------:|:---------------------------------------------------:|:---------------------------------------------------:|
| ![Logout_1](src/main/resources/images/logout_1.png) | ![Logout_2](src/main/resources/images/logout_2.png) | ![Logout_3](src/main/resources/images/logout_3.png) | ![Logout_4](src/main/resources/images/logout_4.png) |
