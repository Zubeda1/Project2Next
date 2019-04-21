Feature:Basket
As a end user
I want to search a product and add in the basket
So that I can buy the product

@regression
Scenario:Add to Basket
Given I am on homepage
When I search a product"womens wear"
And I add any product
And I add the product in the basket
Then I should be able to see the product in the basket

