package com.project2.PageObject;

import com.project2.Driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class ResultPage extends DriverManager {
    @FindBy(css = ".spell-correct")
    private WebElement headertext;
    //search product in the next page element
    public String getProductHeader(){
        return headertext.getText();
    }

    private static String selectProduct;
@FindBy(className = "TitleText")
 private List<WebElement>productNames;
    //select product to add in the basket randomly
    public void selectAnyProduct(){
        int totalProducts = productNames.size();
        if(totalProducts<=0){
            throw  new RuntimeException("No Products are available.");
        }
        Random random= new Random();
        int randomnumber = random.nextInt(totalProducts);
        WebElement selectWebElement = productNames.get(randomnumber);
        selectProduct = selectWebElement.getText();
        selectWebElement.click();
    }//search product randomly
}
