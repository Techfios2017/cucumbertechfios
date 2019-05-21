Feature: User should be able to add Contact

Scenario Outline: User should be able add contact information in his/her account.

Given user is already in Login Page
When user enters "<username>" and "<password>"
Then user will navigate to CRM and click Add Contact
Then user should fill up the form, and click submit
Then After login close the browser


Examples:
|username| password|
|techfiosdemo@gmail.com|abc123|