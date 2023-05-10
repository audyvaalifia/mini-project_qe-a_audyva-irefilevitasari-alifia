Feature: Auth
  As an admin
  I want to see user information
  So that I can register new account

  Scenario: GET - As admin I have be able to get user information
    Given I set Get api endpoint
    When I send Get HTTP Request
    Then I receive valid HTTP Response code 200
    And I receive valid data for user information

  Scenario: POST - As admin I have be able to register a new user account
    Given I set Post api endpoint
    When I send Post HTTP Request
    Then I receive valid HTTP Response code 201
    And I receive valid data for new user account

  Scenario: POST - As admin I have be able to login existing user account
    Given I set Post API endpoint
    When I send Post HTTP request
    Then I receive valid HTTP Response code is 201
    And I receive valid data for existing user account