@us16
Feature: Money transfer should be available
  @US16TC01
  Scenario: Money transfer should be available
    Given Go to "https://gmibank.com/" link
    And Click to User drop down menu
    And Click to Sign in
    And Enter the username with customer valid credentail for transaction.
    And Enter the password with customer valid credentail for transaction.
    And Click to Sign in button
    And Click to My Operation drop down menu
    And Click to Transfer Money
    And Chosee first account from first dropdown
    And Chosee second account from second dropdown
    And Enter a value for transaction
    And Enter the some information to description box.
    And Click to Make Transfer Button
    Then Assert that visible text






