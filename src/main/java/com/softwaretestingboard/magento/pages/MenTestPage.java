package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenTestPage extends Utility {

    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;
   // By menMenu = By.xpath("//a[@id='ui-id-5']");

    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomsMenu;
    //By bottomsMenu = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");

    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsMenu;
    //By pantsMenu = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productsName;
   // By productsName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement productsSize;
    //By productsSize = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");

    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement productColor;
    //By productColor = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");

    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCartButton;
    //By addToCartButton = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement cronusYogaPantText;
    //By cronusYogaPantText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;
    //By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    @FindBy(xpath = "//span[@class='base']")
    WebElement textShoppingCart;
    //By textShoppingCart = By.xpath("//span[@class='base']");

    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement yogaPantProductName;
    //By yogaPantProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size32;
    //By size32 = By.xpath("//dd[contains(text(),'32')]");

    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement blackColorProduct;
    //By blackColorProduct = By.xpath("//dd[contains(text(),'Black')]");

    public void mouseHoverOnMenMenuTab() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottomsMenuTab() {
        mouseHoverToElement(bottomsMenu);
    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(pantsMenu);
    }

    public void mouseHoverOnProductsName() {
        mouseHoverToElement(productsName);
    }

    public void clickOnProductSize() {
        mouseHoverToElementAndClick(productsSize);
    }

    public void clickOnProductColor() {
        mouseHoverToElementAndClick(productColor);
    }

    public void clickOnAddToCart() {
        mouseHoverToElementAndClick(addToCartButton);
    }

    public String getCronasYogaPantAddedText() {
        return getTextFromElement(cronusYogaPantText);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public String getShoppingCartText() {
        return getTextFromElement(textShoppingCart);
    }

    public String getCronusYogaPantText() {
        return getTextFromElement(yogaPantProductName);
    }

    public String getProductSize32Text() {
        return getTextFromElement(size32);
    }

    public String getBlackColorProductText() {
        return getTextFromElement(blackColorProduct);
    }


}
