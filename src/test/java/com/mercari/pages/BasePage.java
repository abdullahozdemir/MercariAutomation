package com.mercari.pages;

import com.mercari.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@slot='input']")
    public WebElement searchBar;

    @FindBy(tagName = "mer-search-input")
    public WebElement typeToSearchbar;


}
