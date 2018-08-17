Feature: Add operation
   In order to gather information about my cash inputs
   I need to be able to store income operation

   Scenario Outline: Add operation
      Given test environment is running
#      And income type <type> is configured
#      And category <category> is configured
#      And account <target_account> is configured
#      And planned operation <planned_operation> is entered with amount of <planned_amount>
      When user logs in to application
      And user opens a page to create operation
#      And user fills in <date>, <type>, <category>, <target_account>, <description>, <amount>, <planned_operation>
      Then save confirmation is displayed
      When user clicks search button
      Then <date>, <type>, <description>, <amount> is visible in search

      Examples:
         | date       | type    | category | target_account | description              | amount | planned_operation  | planned_amount |
         | 2016-01-01 | Income  | Salary   | myAccount      | Salary for December 2015 | 1000   | Salary             | 2000           |
         | 2016-03-31 | Income  | Other    | myOtherAccount | Gift from parents        | 500    | Gifts              | 600            |