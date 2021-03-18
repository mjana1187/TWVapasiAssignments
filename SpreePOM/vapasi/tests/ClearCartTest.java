package com.tw.vapasi.tests;

import com.tw.vapasi.spreepages.AddProductAndCartPage;
import com.tw.vapasi.spreepages.HomePage;
import org.testng.annotations.Test;

public class ClearCartTest extends BaseTest{
    @Test
    public void verifyCheckoutOrderAmount() throws InterruptedException {

        String searchText="Ruby on Rails Mug";
        HomePage homePage = new HomePage(driver);
        homePage.searchByProduct(searchText);
        AddProductAndCartPage addProductAndCartPage=new AddProductAndCartPage(driver);
        addProductAndCartPage.addMoreProductToCart("3");
        addProductAndCartPage.validateEmptyCart();
    }
}
