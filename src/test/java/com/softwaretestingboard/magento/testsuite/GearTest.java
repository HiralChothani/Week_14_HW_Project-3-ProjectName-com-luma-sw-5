package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GearTest extends BaseTest {
    GearTestPage gearTestPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        gearTestPage = new GearTestPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        SoftAssert softAssert = new SoftAssert();
        gearTestPage.mouseHoverOnGearMenu();
        gearTestPage.mouseHoverAndClickOnBags();
        gearTestPage.clickOnOvernightDuffleProductName();
        // Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = gearTestPage.getOvernightDuffleText();
        Assert.assertEquals(actualText, expectedText, "Error message displayed");
        gearTestPage.changeQuantity3();
        gearTestPage.clickOnAddToCartButton();
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedText1 = "You added Overnight Duffle to your shopping cart.";
        String actualText1 = gearTestPage.getProductAddedToShoppingCartText();
        Assert.assertEquals(actualText1, expectedText1, "Error message displayed");
        gearTestPage.clickOnShoppingCart();
        //Verify the product name ‘Overnight Duffle’
        String expectedText2 = "Overnight Duffle";
        String actualText2 = gearTestPage.getProductNameOvernightDuffleText();
        Assert.assertEquals(actualText2, expectedText2, "Error message displayed");

        // Verify the Qty is ‘3’
        String expectedQuantity = "3";
        String actualQuantity = gearTestPage.getTextFromTheEnteredQuantity();
        softAssert.assertEquals(actualQuantity, expectedQuantity, "Not Matching");

        //Verify the product price ‘$135.00’
        String expectedText3 = "$135.00";
        String actualText3 = gearTestPage.getProductPriceText();
        Assert.assertEquals(actualText3, expectedText3, "Error message displayed");
        gearTestPage.changeQuantity5();
        gearTestPage.clickOnUpdateShoppingCart();
        // Verify the product price ‘$225.00'
        String expectedText4 = "$225.00";
        String actualText4 = gearTestPage.verifyProductPrice();
        Assert.assertEquals(actualText4, expectedText4, "Error message displayed");

    }

}
