@AddToCartPos
Feature: AddToCartPos
  As user
  I want to add my necessary items to cart
  So that I can have it

  @userA
  Scenario: As user, I have be able to success add item to cart
    Given I am on the Home page
    When I click beli button in one of many items
    And I click cart icon
    Then I have my product on the cart
