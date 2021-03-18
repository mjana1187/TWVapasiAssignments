package com.tw.vapasi.tests;

import com.tw.vapasi.spreepages.HomePage;
import org.testng.annotations.Test;

public class FilterSearchProductTest extends BaseTest {

    @Test
    public void verifyFilterSearchProductRange() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.filterProductsOf15To18Range();
        homePage.verifyFilterSearchResult();
    }

    @Test
    public void verifySearchProductsItems() throws InterruptedException {
        String[] searchItems={"Ruby","Apache"};
        for(String searchItemText:searchItems) {
            HomePage homePage = new HomePage(driver);
            homePage.searchByProduct(searchItemText);
            homePage.verifySearchItemResult(searchItemText);
        }
    }
}
