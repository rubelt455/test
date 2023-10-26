Feature: User logout
  As a registered user
  I want to log in to my account on the Iqra Shopping website
  So that I can access my account and make purchases

  Scenario: Successful logout
    Given I am logged into my Orange HRM account
    When I click the Logout link
    Then I should be redirected to the login page