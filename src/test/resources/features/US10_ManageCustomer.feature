@managecustomersUS10
Feature: Manage Customers

  Background: Employee is Working On The Manage Customers.
    Given Go GMI Bank Adress
    When Click, SignIn Area
    And Click, SignIn Entrace Button
    And Click UserName TextBox, Write Available UseName
    And Click Password TextBox, Write Available Password
    And Click SignIn Button
    And Click My Operations Area
    And Click Manage Customers
    And Click Create A New Customer
    And Click SSN TextBox, Write Available SSN Number
    And Click Search Button


  @US010TC02
  Scenario: City should be provided and cannot be left as blank US010
    And Click Save Button
    Then See This field is required.

  @US010TC03
  Scenario: Country should be typed and cannot be blank US010
    Then Select Country.

  @US010TC04
  Scenario: State should be provided as US state and cannot be blank US010
    Then Write a State.
