@PurchasePos
Feature: PurchasePos
  As user
  I want to purchase a product
  So that I can get the real product

  @userA
  Scenario: As user, I have to be able to purchase something
    Given I am on the non-account Homepage
    When I click login icon
    And I input Valid email
    And I input Valid Password
    And I click login Button
    And I am on my account home page
    And I click Beli button in one of many products
    And I click Cart Icon
    And I click Bayar Button
    Then I am redirected to transaction history page
