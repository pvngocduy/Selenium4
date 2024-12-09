Feature: Customer Management
  Background:
    Given User open website bank guru99 and register mail
  Scenario: Create new customer account and check created successfully
    When User log in with username and and password provided by system
    And User navigate to the New Customer page and fill customer info to create new customer
    Then User verify the success message and customer details displayed match the input data


