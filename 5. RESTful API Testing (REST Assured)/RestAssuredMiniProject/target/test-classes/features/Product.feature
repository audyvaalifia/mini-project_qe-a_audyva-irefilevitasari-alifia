Feature: Product
  As an admin
  I want to see list of product
  So that I can create new product

  Scenario: GET - As admin I have be able to get detail product
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail product

  Scenario: POST - As admin I have be able to create new product
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new product

  Scenario: DELETE - As admin I have be able to delete existing product
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 204
