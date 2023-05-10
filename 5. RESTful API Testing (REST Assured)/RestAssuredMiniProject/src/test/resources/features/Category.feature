Feature: Category
  As an admin
  I want to see category product
  So that I can create new category product

  Scenario: GET - As admin I have be able to get product category
    Given I set GET api endpoint
    When I send GET HTTP Request
    Then I receive valid HTTP response code is 200
    And I receive valid data for product category

  Scenario: POST - As admin I have be able to assign a product category
    Given I set POST api endpoint
    When I send POST HTTP Request
    Then I receive valid HTTP response code is 201
    And I receive valid data for new product category

  Scenario: DELETE - As admin I have be able to delete existing category
    Given I set DELETE api endpoint
    When I send DELETE HTTP Request
    Then I receive valid HTTP response code is 204