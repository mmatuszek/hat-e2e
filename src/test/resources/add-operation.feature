Feature: Add operation
   In order to gather information about my cash inputs
   I need to be able to store income operation

   Scenario Outline: Add income operation
      Given test environment is running
      And user <username> with <password> exists
      And income categories <categories> exist
      And accounts <accounts> exist
      And planned operation with <planned_description> and <planned_amount> for <month> and <category> exist
      When user logs in to application with <username> and <password>
      And user opens add income operation page
      And enters date <date>
      And selects category <category>
      And selects account <account>
      And enters description <description>
      And enters amount <amount>
      And selects planned operation <planned_description>
      Then user can see that amount left is <planned_amount>
      When user saves operation
      Then operation is saved

      Examples:
         | username   | password    | month  | date       | category | account        | description              | amount | planned_description  | planned_amount |
         | test       | TestPass@1  | March  | 2018-03-21 | Salary   | myAccount      | Salary for December 2015 | 1000   | Salary               | 2000           |