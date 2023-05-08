package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    MenTestPage menTestPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        menTestPage = new MenTestPage();
    }

    @Test(groups = {"sanity","regression" })
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        menTestPage.mouseHoverOnMenMenuTab();
        menTestPage.mouseHoverOnBottomsMenuTab();
        menTestPage.clickOnPants();
        menTestPage.mouseHoverOnProductsName();
        menTestPage.clickOnProductSize();
        menTestPage.mouseHoverOnProductsName();
        menTestPage.clickOnProductColor();
        menTestPage.mouseHoverOnProductsName();
        menTestPage.clickOnAddToCart();
        // Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menTestPage.getCronasYogaPantAddedText();
        Assert.assertEquals(actualText, expectedText, "Error message displayed");
        menTestPage.clickOnShoppingCartLink();
        //Verify the text ‘Shopping Cart.’
        String expectedMessage = "Shopping Cart";
        String actualMessage = menTestPage.getShoppingCartText();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message displayed");
        // Verify the product name ‘Cronus Yoga Pant’
        String expectedMessage1 = "Cronus Yoga Pant";
        String actualMessage1 = menTestPage.getCronusYogaPantText();
        Assert.assertEquals(actualMessage1, expectedMessage1, "Error message displayed");
        // Verify the product size ‘32’
        String expectedText1 = "32";
        String actualText1 = menTestPage.getProductSize32Text();
        Assert.assertEquals(actualText1, expectedText1, "Error message displayed");
        // Verify the product colour ‘Black’
        String expectedText2 = "Black";
        String actualText2 = menTestPage.getBlackColorProductText();
        Assert.assertEquals(actualText2, expectedText2, "Error message displayed");
    }
}
