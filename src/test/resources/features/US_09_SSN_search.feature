@US009TC01
Feature: User can search for a new applicant by their SSN and see all their registration info populated US009
  Scenario: User Information Ceheck Test
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
    And See First Name
    And See Last Name
    Then See Mail Adress

