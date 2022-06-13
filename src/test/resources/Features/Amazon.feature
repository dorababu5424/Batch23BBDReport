Feature: Amazon Product validation

  Scenario Outline: Validate Amazon product in Cart
    Given User will open chrome Browser
    When User will open Amazon URL "<URL>"
    And user will Search Product in Search Box "<PRODUCT>"
    Then user will navigate to products list and click on product
    Then User will be on new window and click on Add cart
    Then Validate the add to cart message

    Examples:
		
		|URL									 |PRODUCT		|
		|https://www.amazon.in/|Hp laptops|