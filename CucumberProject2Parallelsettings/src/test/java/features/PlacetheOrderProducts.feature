Feature: Checkout for the Products
@placeCart
Scenario Outline: Check out the Products added to tthe cart in place order page

Given User is on Greencart Landing page
When User search with the Short name with <Name> and extracted actual name of the product
And Added "3" Items of the selected product to cart
Then User proceeds to the Checkout and Validate the <Name> items in chekout page

Examples:
| Name        |
| TOM         |
| CARROT      |
| tomcat      |

