Feature: This feature is to verify all the About us Page functionality

@Test
Scenario: Verify Video is displayed in About us page
Given Launch Application
Then Verify About us Link is displayed
Then Click About us Link
Then Verify Video is displayed

#can't find the locator for Close button