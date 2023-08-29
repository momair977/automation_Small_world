Feature: Login functionality

  Scenario: Successful login
    Given I am on the login page
    When I enter username "standard_user" and password "secret_sauce"
    Then I should see the products page
