package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WomenTestPage extends Utility {

    @FindBy(xpath = "//a[@class='level-top ui-corner-all'][@id='ui-id-4']")
    WebElement womenMenu;
    //By womenMenu = By.xpath("//a[@class='level-top ui-corner-all'][@id='ui-id-4']");

    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement topMenu;
    //By topMenu = By.xpath("//a[@id='ui-id-9']");

    @FindBy(css = "a[id='ui-id-11'] span")
    WebElement jackets;
    //By jackets = By.cssSelector("a[id='ui-id-11'] span");

//    @FindBy(xpath = "//select[@id='sorter']")
//    WebElement dropDownListProductName;
    By dropDownListProductName = By.xpath("//select[@id='sorter']");

//    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
//    WebElement productNamesElements;
    By productNamesElements = By.xpath("//strong[@class='product name product-item-name']//a");

//    @FindBy(xpath = "(//select[@id='sorter'])[1]")
//    WebElement dropDownListPrice;
    By dropDownListPrice = By.xpath("(//select[@id='sorter'])[1]");

//    @FindBy(xpath = "//div[@class='product details product-item-details']//div[@class='price-box price-final_price']")
//    WebElement priceElements;
    By priceElements = By.xpath("//div[@class='product details product-item-details']//div[@class='price-box price-final_price']");

    public void mouseHoverOnWomenMenuTab() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTopTab() {
        mouseHoverToElement(topMenu);
    }
    public void clickOnJackets() {
        clickOnElement(jackets);
    }

    public void selectSortByFilterProductName() {
        selectByVisibleTextFromDropDown(dropDownListProductName,"Product Name");
    }

    public List<WebElement> returnListOfProductNamesElementsLocator() {
        List<WebElement> listOfElements = driver.findElements(productNamesElements);
        return listOfElements;
    }

    public List<WebElement> returnListOfPriceElementsLocator(){
        List<WebElement> listOfElements = driver.findElements(priceElements);
        return listOfElements;
    }
    public void selectSortByFilterPrice() {
        selectByVisibleTextFromDropDown(dropDownListPrice,"Price");
    }




}
