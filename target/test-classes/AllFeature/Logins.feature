Feature: This feature is to verify all the login functionality



@Test
Scenario: Verify Username textBox is displayed
Given Launch Application
Then Click Login Link
Then Verify Username textBox is displayed

@Test
Scenario: Verify Password textBox is displayed
Given Launch Application
Then Click Login Link
Then Verify Password textBox is displayed

@Test
Scenario: Verify User Login
Given Launch Application
Then Click Login Link
Then Verify Login button is enabled
Then Type username and password and click signin
Then Verify User login successfully
