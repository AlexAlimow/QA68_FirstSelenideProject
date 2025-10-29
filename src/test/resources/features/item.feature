Feature: Add item
  @item
  Scenario: Add one item to cart
    Given User on Home page
    When User click on Login
    And User enter data
    And User click on Anmelden
    And User click on Moebel link
    And User goes to Sofas page and click on first sofa
    And User add item to cart
    And User goes to cart page
    Then User verifies his item added to cart