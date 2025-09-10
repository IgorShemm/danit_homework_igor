Feature: Login functionality verification

  Scenario: Verify validation error appears for incorrect email format
    Given User opens Home Page
    When User clicks on login button on Home Page
    And User enters login value "test"
    And User enters password "123456"
    And User clicks login button
    Then verify validation error message contains "Введіть коректний email або номер мобільного телефону"

  Scenario: Verify error message appears when login fields are empty
    Given User opens Home Page
    When User clicks on login button on Home Page
    And User clicks login button
    Then verify validation error message contains "Введіть email або номер мобільного телефону"

