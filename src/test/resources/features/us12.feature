@asw
Feature: Employee can manage customer

Scenario: Employee can see user information in a table with specified columns
Given user sign in to the system as employee
When user navigates to Manage Customers page under My Operations menu
  Then verify that a table is displayed in the Customers_page with following columns
    | ID                   |
    | First Name          |
    | Last Name           |
    | Middle Initial      |
    | Email               |
    | Mobile Phone Number |
    | Phone Number        |
    | Address             |
    | Create Date         |
  Scenario: Employee can see user information in their own page after clicking view button
    Given user sign in to the system as employee
    When user navigates to Manage Customers page under My Operations menu
    Then verify that there is view button in the table
    When verify that after clicking view button for a user with a randomly selected email in the page, user information is populated
    And verify that in the user page, there is an edit button


  Scenario: Employee can see user information in their own page after clicking "edit" button
    Given user sign in to the system as employee
    When user navigates to Manage Customers page under My Operations menu
    Then verify that there is one edit button for each row in the table
    And verify that after clicking edit button for a user with a randomly selected email in the page, user information is populated on create_or_edit_customer_page


  Scenario: Employee can edit user information in their own page after clicking "edit" button
    Given user sign in to the system as employee
    When user navigates to Manage Customers page under My Operations menu
    Then verify that after clicking edit button for a user with a randomly selected email in the page, user information is populated on create_or_edit_customer_page
    And user edit city by generating a new one in create_or_edit_customer_page
    Then verify that a message is displayed such as tPCustomer.updated on the customers_page and new value is seen on user_info_page


  Scenario: Employee can delete a user under manage customers
    Given user sign in to the system as employee
    When user navigates to Manage Customers page under My Operations menu
    And user clicks delete button for a user with a randomly selected email in the page
    Then verify that such an information message tPCustomer.deleted is appeared after delete operation
