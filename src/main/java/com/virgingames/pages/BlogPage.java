package com.virgingames.pages;

import com.virgingames.browserfactory.ManageBrowser;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends Utility {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    //Blog post
    @CacheLookup
    @FindBy(xpath = "//div[@class='StyledBlogGrid-sc-bw5rq7-2 cbZomE']//h3[@class='StyledTitle-sc-18zd085-3 xEXYN'][normalize-space()='The Hidden Treasures of Egypt-Themed Slots']")
    WebElement blogPost;

    //welcome text
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement welcomeText;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Verify the welcome text 'Welcome to the Virgin Games Blog' " + blogPost.toString());
        return message;
    }

    public void clickOnBlogPost() {
        clickOnElement(blogPost);
        log.info("Clicking on blog post 'The Hidden Treasures of Egypt-Themed Slots' " + blogPost.toString());
    }
}
