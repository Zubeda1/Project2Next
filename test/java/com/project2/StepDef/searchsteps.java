package com.project2.StepDef;

import com.project2.PageObject.HeaderPage;
import com.project2.PageObject.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.project2.PageObject.HeaderPage.searchItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static sun.security.krb5.internal.KDCOptions.with;

public class searchsteps {
    private HeaderPage headerPage = new HeaderPage();
    private ResultPage resultPage = new ResultPage();
    @Given("^I am on homepage$")
    public void i_am_on_homepage(){
       String actual= headerPage.getcurrenturl();
       assertThat(actual,is(endsWith("co.uk/") ));

    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item)  {
        headerPage.searchProduct(item);


    }

    @Then("^I should be able to see respective results$")
    public void i_should_be_able_to_see_respective_results()  {
        String actual =resultPage.getProductHeader();
        assertThat(actual,is (equalToIgnoringCase(searchItem)));
    }

}
