Feature: Order
  As an admin
  I want to see category product
  So that I can create new category product

  Scenario: GET - As admin I have be able to get order
    Given I set Get API endpoints
    When I send Get Http Request
    Then I receive valid Http Response code 200
    And I receive valid data for the order

  Scenario: POST - As admin I have be able to create a new order
    Given I set Post API endpoints
    When I send Post Http Request
    Then I receive valid Http Response code 201
    And I receive valid data for new order