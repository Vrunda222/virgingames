package com.virgingames.testsuite;

import com.virgingames.pages.BlogPage;
import com.virgingames.pages.HomePage;
import com.virgingames.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {

    HomePage homePage;
    BlogPage blogPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        blogPage = new BlogPage();
    }

    @Test
    public void verifyUserShouldNavigateToBlogPage(){
        homePage.clickOnCookiesButton();
        homePage.clickOnBlogLink();
       // Assert.assertEquals("Welcome to the Virgin Games Blog", blogPage.getWelcomeText(), "Blog page not displayed");
        blogPage.clickOnBlogPost();
    }
}
