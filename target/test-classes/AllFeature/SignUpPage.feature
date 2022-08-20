Feature: This feature is to verify all the SignUp Page functionality

@Test
Scenario: Verify Username textBox is displayed in Signup Page
Given Launch Application
Then Click Sign up Link
Then Verify Username textBox is displayed in Signup Page

@Test
Scenario: Verify Password textBox is displayed in Signup Page
Given Launch Application
Then Click Sign up Link
Then Verify Password textBox is displayed in Signup Page

@Test
Scenario: Verify Sign up link is displayed in Signup Page
Given Launch Application
Then Click Sign up Link
Then Verify Sign up Link is enabled

@Test
Scenario: Verify Password textBox is displayed in Signup Page
Given Launch Application
Then Click Sign up Link
Then Type username and password and click signup button
#Then Verify sign up button is working fine
