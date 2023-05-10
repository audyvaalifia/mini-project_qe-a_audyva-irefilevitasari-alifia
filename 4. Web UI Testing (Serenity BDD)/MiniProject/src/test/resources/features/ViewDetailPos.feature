@ViewDetailPos
Feature: ViewDetailPos
  As user
  I want to view detail of product
  So that I can make a choice before purchasing the product

  @userA
  Scenario: As user, I have be able to success view detail of product
    Given I am on the Homepage
    When I choose product i want
    And I click detail button in one of many items
    Then I have seen the details of product
