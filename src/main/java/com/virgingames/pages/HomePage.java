package com.virgingames.pages;

import com.virgingames.browserfactory.ManageBrowser;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    //all cookies button
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Allow all cookies']")
    WebElement cookiesButton;

    //Blog link
    @CacheLookup
    @FindBy(linkText = "Blog")
    WebElement blogLink;


    public void clickOnCookiesButton() {
        clickOnElement(cookiesButton);
        log.info("Clicking on All Cookies Button " + cookiesButton.toString());
    }

    public void clickOnBlogLink() {
        clickOnElement(blogLink);
        log.info("Clicking on blog link " + blogLink.toString());
    }

}
