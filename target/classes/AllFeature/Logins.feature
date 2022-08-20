Feature: This feature is to verify all the login functionality

@Regression
Scenario: Verify User Login
#Given Launch "<URL>" Application
Given Launch Application
Then Click Login Link
Then Type username and password and click signin
Then Verify User login successfully