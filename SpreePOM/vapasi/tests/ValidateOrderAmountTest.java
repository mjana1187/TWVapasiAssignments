package com.tw.vapasi.tests;

import com.tw.vapasi.spreepages.AddProductAndCartPage;
import com.tw.vapasi.spreepages.HomePage;
import org.testng.annotations.Test;

public class ValidateOrderAmountTest extends BaseTest{

    @Test
    public void verifyCheckoutOrderAmount() {

        String searchText="Ruby on Rails Mug";
        HomePage homePage = new HomePage(driver);
        homePage.searchByProduct(searchText);
        AddProductAndCartPage addProductAndCartPage=new AddProductAndCartPage(driver);
        String itemPrice=addProductAndCartPage.addProductToCart();
        addProductAndCartPage.validateTotalCartAmount(itemPrice);
    }
}
