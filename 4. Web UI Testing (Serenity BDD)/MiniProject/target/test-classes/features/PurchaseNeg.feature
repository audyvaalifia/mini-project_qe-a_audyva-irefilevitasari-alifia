@PurchaseNeg
Feature: PurchaseNeg
  As user
  I want to purchase a product
  So that I can get the real product

  @userA
  Scenario: As user, I have to be prevented to purchase
    Given I am on the home page
    When I click beli button in one of many products
    And I click Cart icon
    And I click Bayar button
    Then I am redirected to login form
