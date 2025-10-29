Feature: Login
@login
  Scenario: Successful login
    Given User is on Home page
    When User clicks on Login icon
    And User enters correct data
    And User clicks on Anmelden button
    And User clicks on User status
    Then User verifies his name is displayed
