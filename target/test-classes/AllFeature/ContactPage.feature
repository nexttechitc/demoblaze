Feature: This feature is to verify all the Contact Page functionality

@Test
Scenario: Verify Contact Email textBox is displayed in Contact Page
Given Launch Application
Then Click Contact Link
Then Verify Contact Email textBox is displayed in Contact Page

@Test
Scenario: Verify Contact Name textBox is displayed in Contact Page
Given Launch Application
Then Click Contact Link
Then Verify Contact Name textBox is displayed in Contact Page

@Test
Scenario: Verify message textBox is displayed in Contact Page
Given Launch Application
Then Click Contact Link
Then Verify message textBox is displayed in Contact Page

@Test
Scenario: Verify Send Message button is working fine in Contact Page
Given Launch Application
Then Click Contact Link
Then Enter Contact Name Contact Email Message and click Send Message button in Contact Page
#Then Verify Send Message button is working fine in Contact Page