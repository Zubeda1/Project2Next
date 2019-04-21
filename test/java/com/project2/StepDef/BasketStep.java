package com.project2.StepDef;

import com.project2.PageObject.BasketPage;
import com.project2.PageObject.HeaderPage;
import com.project2.PageObject.ResultPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasketStep {
    private HeaderPage headerPage= new HeaderPage();
    private ResultPage resultPage = new ResultPage();
    private BasketPage basketPage = new BasketPage();
    @When("^I search a product\"([^\"]*)\"$")
    public void i_search_a_product(String item){
        headerPage.searchProduct(item);
    }

    @When("^I add any product$")
    public void i_add_any_product(){
        resultPage.selectAnyProduct();

    }

    @When("^I add the product in the basket$")
    public void i_add_the_product_in_the_basket(){

    }

    @Then("^I should be able to see the product in the basket$")
    public void i_should_be_able_to_see_the_product_in_the_basket(){
        basketPage.getProductsInBaskets();
    }
}
