Feature: Client should be able to login

Scenario Outline: Clients should be able to login, with correct credentials

Given user is already in Login Page
When user enters "<username>" and "<password>"
Then After login close the browser

Examples:
|username| password|
|techfiosdemo@gmail.com|abc123|