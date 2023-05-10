Feature: Rating
  As an admin
  I want to see rating product
  So that I can create new rating product

  Scenario: GET - As admin I have be able to get rating product
    Given I set GET API endpoints
    When I send GET Http request
    Then I receive valid Http response code 200
    And I receive valid data for rating product

  Scenario: POST - As admin I have be able to assign a rating product
    Given I set POST API endpoints
    When I send POST Http request
    Then I receive valid Http response code 201
    And I receive valid data for new rating product