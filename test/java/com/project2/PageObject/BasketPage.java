package com.project2.PageObject;

import com.project2.Driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BasketPage extends DriverManager {
    @FindBy(className = "itemDesc")
    private List<WebElement>productsInBasket;


    public List<String> getProductsInBaskets(){
        List<String>productNamesInBasket = new ArrayList<>();
        for(WebElement productInBasket:productsInBasket){
            productNamesInBasket.add(productInBasket.getText());
        }return productNamesInBasket;
    }
}
