package com.mercari.step_definitions;

import com.mercari.pages.BasePage;
import com.mercari.pages.SearchPage;
import com.mercari.utilities.BrowserUtils;
import com.mercari.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.List;

public class ProductStepdefs {



    BasePage basePage = new BasePage();
    SearchPage searchPage = new SearchPage();
    WebDriver driver;


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
//        dropOrder.selectByVisibleText("score:desc");
//        dropOrder.selectByValue("score:desc");
        dropOrder.selectByIndex(2);
        BrowserUtils.waitFor(3);
    }

    @And("Select the first and cheapest product")
    public void selectTheFirstAndCheapestProduct() {

        searchPage.sortedProduct.get(0).click();

        BrowserUtils.waitFor(2);
        
    }

    @And("Get the product price")
    public void getTheProductPrice() {

        WebElement root1 = driver.findElement(By.tagName("mer-text"));

        JavascriptExecutor jsEx = (JavascriptExecutor)driver;
        WebElement shadowRoot = (WebElement) jsEx.executeScript("return arguments[0].shadowRoot",root1);

        WebElement root2 = shadowRoot.findElement(By.tagName("mer-price"));
        WebElement price = root2.findElement(By.className("price"));
        System.out.println("price.getText() = " + price.getText());

    }

    @Then("Compare the price")
    public void compareThePrice() {
    }
}
