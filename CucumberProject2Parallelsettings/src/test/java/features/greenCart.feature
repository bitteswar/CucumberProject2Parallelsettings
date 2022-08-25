Feature: Search and place the order for Products
@Greencart
Scenario: Search Exp in both Product and Offer page

Given User is on Greencart Landing page
When User search with the Short name "TOM" and extracted actual name of the product
Then User Search for the same short name "TOM" in the offer page
And Check if the product exists
 