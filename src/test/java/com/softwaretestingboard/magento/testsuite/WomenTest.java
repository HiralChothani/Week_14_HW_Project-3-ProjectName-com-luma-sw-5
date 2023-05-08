package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenTestPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

public class WomenTest extends BaseTest {

    WomenTestPage womenTestPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        womenTestPage = new WomenTestPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        womenTestPage.mouseHoverOnWomenMenuTab();
        womenTestPage.mouseHoverOnTopTab();
        womenTestPage.clickOnJackets();
        womenTestPage.selectSortByFilterProductName();

        //Verify the products name display in alphabetical order
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenTestPage.returnListOfProductNamesElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenTestPage.returnListOfProductNamesElementsLocator());

        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        womenTestPage.mouseHoverOnWomenMenuTab();
        womenTestPage.mouseHoverOnTopTab();
        womenTestPage.clickOnJackets();
        womenTestPage.selectSortByFilterPrice();

        //Verify the products price display in Low to High
        ArrayList<String> actualList = getArrayListOfStringsFromWebElements(womenTestPage.returnListOfPriceElementsLocator());
        ArrayList<String> expectedList = getArrayListOfStringsFromWebElements(womenTestPage.returnListOfPriceElementsLocator());


        Collections.sort(expectedList);
        Assert.assertEquals(actualList, expectedList, "Error message: Products are not displayed in alphabetical order");

    }
}
