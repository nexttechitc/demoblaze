
Feature: This Suite for Meta Sanety

@Sa
Scenario: Verify Username textBox is displayed in Signup Page
Given Launch Application
Then Click Sign up Link
Then Verify Username textBox is displayed in Signup Page

@Sa
Scenario: Verify Password textBox is displayed in Signup Page
Given Launch Application
Then Click Sign up Link
Then Verify Password textBox is displayed in Signup Page

@Sa
Scenario: Verify Sign up link is displayed in Signup Page
Given Launch Application
Then Click Sign up Link
Then Verify Sign up Link is enabled

@Sa
Scenario: Verify Password textBox is displayed in Signup Page
Given Launch Application
Then Click Sign up Link
Then Type username and password and click signup button
#Then Verify sign up button is working fine
@Sa
Scenario: Verify Username textBox is displayed
Given Launch Application
Then Click Login Link
Then Verify Username textBox is displayed

@Sa
Scenario: Verify Password textBox is displayed
Given Launch Application
Then Click Login Link
Then Verify Password textBox is displayed

@Sa
Scenario: Verify User Login
Given Launch Application
Then Click Login Link
Then Verify Login button is enabled
Then Type username and password and click signin
Then Verify User login successfully