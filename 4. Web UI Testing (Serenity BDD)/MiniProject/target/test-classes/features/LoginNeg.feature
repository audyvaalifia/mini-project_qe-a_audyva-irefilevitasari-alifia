@LoginNeg
Feature: LoginNeg
  As user
  I want to buy something
  So that I can have my account

  @userA
  Scenario: As user, I have to be prevented to success register
    Given I am on the nonaccount Home page
    When I click login-home icon
    And I input Valid Email
    And I input invalid Password
    And I click Login Button
    Then I am still remain in Login form
