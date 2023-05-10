@LoginPos
Feature: LoginPos
  As user
  I want to buy something
  So that I can have my account

  @userA
  Scenario: As user, I have be able to success register
    Given I am on the non-account Home page
    When I click login home icon
    And I input valid Email
    And I input valid Password
    And I click Login button
    Then I am on the account home page
