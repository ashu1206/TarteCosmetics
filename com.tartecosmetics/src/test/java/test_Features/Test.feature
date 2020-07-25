Feature: Check the adding and deleting functionality of tartecosmetics.com

Scenario: Test Steps of above functionality
Given launch the url
Then navigate to any category from Top Nav
And add three products to the cart
Then go to bag page
And delete any product
Then verify the product is removed
