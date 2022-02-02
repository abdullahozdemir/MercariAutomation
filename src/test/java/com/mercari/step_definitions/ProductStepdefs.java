package com.mercari.step_definitions;

import com.mercari.pages.BasePage;
import com.mercari.pages.SearchPage;
import com.mercari.utilities.BrowserUtils;
import com.mercari.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;


public class ProductStepdefs {



    BasePage basePage = new BasePage();
    SearchPage searchPage = new SearchPage();



    @Given("Go to main page and verify the correct page")
    public void goToMainPageAndVerifyTheCorrectPage() {

        Assert.assertEquals("verify the correct page","https://jp.mercari.com/", Driver.get().getCurrentUrl());
        BrowserUtils.waitFor(2);
    }

    @When("click search bar")
    public void clickSearchBar() {


        basePage.typeToSearchbar.click();
        BrowserUtils.waitFor(1);


    }

  

    @And("type shoes and select ascending sort")
    public void typeShoesAndSelectAscendingSort() {

        basePage.typeToSearchbar.sendKeys("靴",Keys.ENTER);
        BrowserUtils.waitFor(2);

        searchPage.productOrder.click();

        Select dropOrder = new Select(searchPage.productOrder);
//      dropOrder.selectByVisibleText("score:desc");
//      dropOrder.selectByValue("score:desc");
        dropOrder.selectByIndex(2);
        BrowserUtils.waitFor(3);
    }

    @And("Select the first and cheapest product")
    public void selectTheFirstAndCheapestProduct() {

        searchPage.sortedProduct.get(0).click();

        BrowserUtils.waitFor(2);
        
    }


    @Then("Get the product price and verify it")
    public void getTheProductPriceAndVerifyIt() {

        WebElement firstShadowRoot = Driver.get().findElement(By.xpath("//div[@class='mer-spacing-b-12']//following-sibling::section//mer-text"));

        // I get all the information and after manupilation get the only price
        String innerHTML = firstShadowRoot.getAttribute("innerHTML");
        String fromValue = innerHTML.substring(innerHTML.indexOf("value"));
        String fromValStart = fromValue.substring(fromValue.indexOf("\"") + 1);
        String valStr = fromValStart.substring(0, fromValStart.indexOf("\""));
        System.out.println(valStr);

        Assert.assertEquals("verify the cheapest price","301",valStr);

    }
}
