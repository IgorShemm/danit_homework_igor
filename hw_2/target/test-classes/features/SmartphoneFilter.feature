Feature: Smartphone filtering by battery capacity

  Scenario: Verify product list updates after applying battery filter
    Given User opens Home Page
    When User enters search query "смартфон"
    And User clicks search button
    And User saves first product title
    And User applies battery filter
    Then verify first product title has changed