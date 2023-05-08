package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearTestPage extends Utility {
    @FindBy(xpath = "//a[@id='ui-id-6']")
    WebElement gearMenu;
    //By gearMenu = By.xpath("//a[@id='ui-id-6']");

    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bags;
    //By bags = By.xpath("//span[contains(text(),'Bags')]");

    @FindBy(xpath = "//a[contains(text(),'Overnight Duffle')]")
    WebElement overnightDuffle;
    //By overnightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle')]");

    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement overnightDuffleText;
    //By overnightDuffleText = By.xpath("//span[contains(text(),'Overnight Duffle')]");

    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantity3;
    //By quantity3 = By.xpath("//input[@id='qty']");

    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;
    //By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedDuffleText;
    //By addedDuffleText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    //By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productNameDuffle;
    //By productNameDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");

    @FindBy(css = ".input-text.qty")
    WebElement text3;
    //By text3 = By.cssSelector(".input-text.qty");

    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement price135;
    //By price135 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");

    @FindBy(css = ".input-text.qty")
    WebElement quantity5;
    //By quantity5 = By.cssSelector(".input-text.qty");

    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    //By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    @FindBy(xpath = "//span[contains(text(),'$225.00')]")
    WebElement productPrice225;
   // By productPrice225 = By.xpath("//span[contains(text(),'$225.00')]");


    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBags() {
        mouseHoverToElementAndClick(bags);
    }

    public void clickOnOvernightDuffleProductName() {
        clickOnElement(overnightDuffle);
    }

    public String getOvernightDuffleText() {
        return getTextFromElement(overnightDuffleText);
    }

    public void changeQuantity3() {
        clearValueFromTextBox(quantity3);
        sendTextToElement(quantity3, "3");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    public String getProductAddedToShoppingCartText() {
        return getTextFromElement(addedDuffleText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String getProductNameOvernightDuffleText() {
        return getTextFromElement(productNameDuffle);
    }

    public String getTextFromTheEnteredQuantity(){
        Reporter.log("Entered quantity "+ text3.getAttribute("value"));
        return getTextFromElement(text3);
    }

    public String getProductPriceText() {
        return getTextFromElement(price135);
    }

    public void changeQuantity5() {
        clearValueFromTextBox(quantity5);
        sendTextToElement(quantity5, "5");
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String verifyProductPrice() {
        return getTextFromElement(productPrice225);
    }
}
