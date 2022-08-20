package com.demoBlazeTest.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demoBlazeTest.Utility.Base_Parent;

public class AboutUsPageLocators extends Base_Parent {

	public AboutUsPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[@class='vjs-big-play-button']")
	public WebElement playButton;
	@FindBy(how = How.ID, using = "videoModalLabel")
	public WebElement aboutUsText;
	@FindBy(how = How.XPATH, using = "//div[@class='vjs-text-track-display']")
	public WebElement video;
	
}
