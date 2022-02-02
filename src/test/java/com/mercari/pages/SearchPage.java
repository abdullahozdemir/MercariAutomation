package com.mercari.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//select[@name='sortOrder']")
    public WebElement productOrder;

   @FindBy(xpath = "//li/a/mer-item-thumbnail")
    public List<WebElement> sortedProduct;
}
