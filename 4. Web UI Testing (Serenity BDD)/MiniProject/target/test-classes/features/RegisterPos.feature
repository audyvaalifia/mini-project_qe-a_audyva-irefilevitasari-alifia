@RegisterPos
Feature: RegisterPos
  As user
  I want to buy something
  So that I can have my account

  @userA
  Scenario: As user, I have be able to success register
    Given I am on the non-account home page
    When I click login home button
    And I click Register link
    And I input Full name
    And I input valid email
    And I input valid password
    And I click Register button
    Then I am on the login form
