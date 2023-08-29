Feature: Cart functionality

  Scenario: Add products to the cart
    When I add product number 1 to the cart
    And I add product number 2 to the cart
    Then I should see 2 item(s) in the cart
    
  Scenario: Remove all items from the cart
    Given I add product number 1 to the cart
    And I add product number 2 to the cart
    When I open the cart
    And I remove all items from the cart
    Then The cart should be empty
