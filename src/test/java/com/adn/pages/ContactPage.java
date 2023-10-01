package com.adn.pages;

import com.adn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="DrpDwnMn0-jgk6label")
    public WebElement contactTitre;

    @FindBy(id="input_comp-kybe0nrn")
    public WebElement nom;

    @FindBy(id="input_comp-kybe0ns1")
    public WebElement email;

    @FindBy(id="input_comp-kybe0ns5")
    public WebElement telephone;

    @FindBy(xpath="//textarea[@class=\"rEindN has-custom-focus wixui-text-box__input\"]")
    public WebElement message;

    @FindBy(xpath = "(//span[@class=\"M3I7Z2 wixui-button__label\"])[1]")
    public WebElement envoyer;
}