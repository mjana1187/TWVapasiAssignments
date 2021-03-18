package com.tw.vapasi.spreepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "keywords")
    private WebElement searchText;

    @FindBy(id = "link-to-cart")
    private WebElement cartButton;

    @FindBy(css = "input[class='btn btn-success']")
    private WebElement searchButton;

    @FindBys(@FindBy(css = "span[title*='Ruby']"))
    private List<WebElement> rubySearchItems;

    @FindBys(@FindBy(xpath = "//span[@class='info']"))
    private List<WebElement> searchItems;

    @FindBys(@FindBy(css = "input[class='btn btn-success']"))
    private List<WebElement> apacheSearchItems;

    @FindBy(linkText = "Bags")
    private WebElement catagoryBags;

    @FindBy(id = "Price_Range_$15.00_-_$18.00")
    private WebElement priceRange15To18;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement filterSearchButton;

    @FindBys(@FindBy(css = ".price.selling.lead"))
    private List<WebElement> filterSearchItems;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void filterProductsOf15To18Range() {
        catagoryBags.click();
        priceRange15To18.click();
        filterSearchButton.click();
    }


    public void verifyFilterSearchResult(){
        for(int i=0;i<filterSearchItems.size();i++)
        {
            String productPrice = filterSearchItems.get(i).getText();
            productPrice = productPrice.replace("$","");
            double itemPrice = Double.parseDouble(productPrice);
            System.out.println(itemPrice);
            Assert.assertTrue(itemPrice>=15 && itemPrice<=18);
        }
    }

    public void searchByProduct(String item)
    {
        searchText.clear();
        searchText.sendKeys(item);
        searchButton.click();
    }

    public void verifySearchItemResult(String result)
    {
        String searchedText;
        for(int i=0;i<searchItems.size();i++)
        {
            searchedText=searchItems.get(i).getText();
            System.out.println(searchedText);
            Assert.assertTrue(searchedText.contains(result));
        }
    }
}

