Feature: Select an item

  Scenario: Validate that the item selected successfully
    Given User on home page
    And User enter valid data
    When Click on let's shop
    And select an item
    Then the item selected successfully