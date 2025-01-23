Feature: Test Sauce Demo application

  Scenario: validate Login Functionality
    Given user is on login page
    When user enter valid username as "standard_user" and password as "secret_sauce"
    Then user click on login button

  Scenario: validate product page functionality
    Given user is on product page
    When user select high to low price products
    And user add 5 products to cart
    Then user click on container button
    And user click on checkout button

  Scenario: validate personal details functionality
    When user enter "Anjali" firstname and "Patil" lastname and "323444" pincode
    And user click on continue button
    And user click on finish button
