Feature: Visit Mercari web page

  Scenario:Compare the shoes price
    Given Go to main page and verify the correct page
    When click search bar
    And type shoes and select ascending sort
    And Select the first and cheapest product
    Then Get the product price and verify it
    