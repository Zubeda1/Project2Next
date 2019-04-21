package com.project2;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/basket.feature",dryRun = false,strict = true,tags = "@regression",plugin = "json:target/cucumber.json")


public class RunCukesTest {
}
