Feature: This feature is to verify all the HomePage functionality

@Test
Scenario: Verify Home Link is displayed
Given Launch Application
Then Verify Home Link is displayed
Then Click Home Link
Then Verify Home Link is enabled

@Test
Scenario: Verify Contact Link is displayed
Given Launch Application
Then Verify Contact Link is displayed
Then Click Contact Link
Then Verify Contact Link is enabled

@Test
Scenario: Verify About us Link is displayed
Given Launch Application
Then Verify About us Link is displayed
Then Click About us Link
Then Verify About us Link is enabled
Then Verify About us Text is displayed

@Test
Scenario: Verify Contact Link is displayed
Given Launch Application
Then Verify Contact Link is displayed
Then Click Contact Link
Then Verify Contact Link is enabled

@Test
Scenario: Verify Cart Link is displayed
Given Launch Application
Then Verify Cart Link is displayed
Then Click Cart Link
Then Verify Cart Link is enabled

@Test
Scenario: Verify Login Link is displayed
Given Launch Application
Then Verify Login Link is displayed
Then Click Login Link
Then Verify Login Link is enabled

@Test
Scenario: Verify Sign up Link is displayed
Given Launch Application
Then Verify Sign up Link is displayed
Then Click Sign up Link
Then Verify Sign up Link is enabled