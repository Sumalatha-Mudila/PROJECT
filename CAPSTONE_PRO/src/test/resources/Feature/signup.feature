Feature: Sign Up functionality of Demoblaze Website

  Scenario: Successful user registration
    Given User launches the Demoblaze website
    When User clicks on Sign up link
    And User enters username and password
    And User clicks on Sign up button
    Then User should see registration success message