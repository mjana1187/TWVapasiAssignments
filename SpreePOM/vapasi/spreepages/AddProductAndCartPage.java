package com.tw.vapasi.spreepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AddProductAndCartPage extends BasePage {

    public AddProductAndCartPage(WebDriver driver){super(driver);}

    @FindBy(id = "link-to-cart")
    private WebElement cartButton;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(linkText = "Ruby on Rails Mug")
    private WebElement productRubyOnRailsMug;

    @FindBy(xpath = "//td[@class='lead']")
    private WebElement totalCartAmount;

    @FindBy(css = "span[itemprop='price']")
    private WebElement itemPrice;

    @FindBy(id = "quantity")
    private WebElement itemQuantity;

    @FindBy(css = "div[class='alert alert-info']")
    private WebElement emptyCartMessageLink;

    @FindBy(xpath = "//*[@name='commit']")
    private WebElement emptyCartButton;

    public String addProductToCart() {
        productRubyOnRailsMug.click();
        String getItemPrice=itemPrice.getText();
        addToCartButton.click();
        return getItemPrice;
    }

    public void addMoreProductToCart(String productQuantity) {
        productRubyOnRailsMug.click();
        itemQuantity.clear();
        itemQuantity.sendKeys(productQuantity);
        addToCartButton.click();
    }

    public void validateTotalCartAmount(String itemPrice)  {
        String cartTotalAmount=totalCartAmount.getText();
        Assert.assertEquals(cartTotalAmount,itemPrice);
    }

    public void validateEmptyCart() throws InterruptedException {
        emptyCartButton.click();
        String validateText=emptyCartMessageLink.getText();
        System.out.println(validateText);
        Assert.assertEquals(validateText,"Your cart is empty");
    }
}

