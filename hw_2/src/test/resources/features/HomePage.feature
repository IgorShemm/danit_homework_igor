Feature: Home Page functionality verification

  Scenario: Verify search field works correctly
    Given User opens Home Page
    When User enters "iPhone" word into search field on Home Page
    And User clicks on search button on Home Page
    Then title contains "iPhone" search word on Search Result Page

  Scenario: Verify main catalog menu appears after clicking on catalog button
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    Then verify main catalog menu appears on Home Page