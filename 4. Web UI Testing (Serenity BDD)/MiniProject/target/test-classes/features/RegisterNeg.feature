@RegisterNeg
Feature: RegisterNeg
  As user
  I want to buy something
  So that I can have my account

  @userA
  Scenario: As user, I have be able to prevented to register
    Given I am on the non-account homepage
    When I click Login home icon
    And I click Register Link
    And I input Fullname
    And I input already existed email
    And I input password
    And I click Register Button
    Then I am still remain in Register form
