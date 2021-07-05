@login
Feature: Login
Background:
  Given initiate the browser
  Given instagram login page

  @loginWithoutParameter
  Scenario: login without parameter
    When input username
    And input password
    And click Log In
    Then Save Your Login Info label displayed
    When click Profile
    And click Log Out
    Then Logging Out label displayed
    And back to Login Page

  @loginWithParameter
  Scenario Outline: login with parameter
    When input username with "<username>"
    And input password with "<password>"
    And click Log In
    Then Save Your Login Info label displayed
    When click Profile
    And click Log Out
    Then Logging Out label displayed
    And back to Login Page
    Examples:
    | username    | password   |
    | dummy280997 | dumdum2828 |