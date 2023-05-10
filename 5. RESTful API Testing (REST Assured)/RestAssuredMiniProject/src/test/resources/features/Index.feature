Feature: Index
  As an admin
  I want to say hello
  So that I can view data hello

  Scenario: GET - As admin I have be able to get to say hello
    Given I set Get API endpoint
    When I send Get HTTP request
    Then I receive valid HTTP Response code is 200
    And I receive valid data for say hello