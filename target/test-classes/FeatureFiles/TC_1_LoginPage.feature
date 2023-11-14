
@LoginPage
Feature: Verifying AdactInHotel login page


  Scenario: Validating AdactInHotel login page with valid credentials
    Given User Should Successfully navigate to AdactInHotel URL
    When User Should enter valid Username & Password
   	And User Should Click the login button
    Then User Should be login successfully 

  
