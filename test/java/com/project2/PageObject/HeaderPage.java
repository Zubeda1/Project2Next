package com.project2.PageObject;

import com.project2.Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends DriverManager {
    public static String searchItem;
    @FindBy(className = "SearchBox")
    private WebElement searchTextBox;

    @FindBy(className = "SearchButton")
    private WebElement magniGlass;

    public void searchProduct(String item) {
        searchItem = item;
        searchTextBox.sendKeys(item);

        waitUntilClickable(driver.findElement(By.className("SearchButton")));
        magniGlass.click();
    }
    public void emptysearch(){
        magniGlass.click();
    }
    public String getcurrenturl(){
        return driver.getCurrentUrl();
    }
}



