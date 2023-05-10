Feature: Comment
  As an admin
  I want to see rating product
  So that I can create new rating product

  Scenario: GET - As admin I have be able to get product comment
    Given I set GET API endpoint
    When I send GET Http Request
    Then I receive valid Http response code is 200
    And I receive valid data for product comment

  Scenario: POST - As admin I have be able to assign a product comment
    Given I set POST API endpoint
    When I send POST Http Request
    Then I receive valid Http response code is 201
    And I receive valid data for new product comment