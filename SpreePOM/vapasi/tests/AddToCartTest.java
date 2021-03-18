package com.tw.vapasi.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void AddRubyOnRailsMugToCart() {
        driver.findElement(By.linkText("Mugs")).click();
        driver.findElement(By.xpath("//span[@title='Ruby on Rails Mug']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
        //driver.findElement(By.);

    }
}
