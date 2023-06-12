Feature: This feature is to verify all the login functionality



@Sanity
Scenario: Verify Username textBox is displayed
Given Launch Application
Then Click Login Link
Then Verify Username textBox is displayed

@Sanity
Scenario: Verify Password textBox is displayed
Given Launch Application
Then Click Login Link
Then Verify Password textBox is displayed

@Sanity
Scenario: Verify User Login
Given Launch Application
Then Click Login Link
Then Verify Login button is enabled
Then Type username and password and click signin
Then Verify User login successfully
