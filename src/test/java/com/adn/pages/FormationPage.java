package com.adn.pages;

import com.adn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class FormationPage {
    public FormationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "DrpDwnMn0-jgk3label")
    public WebElement formationTitre;

    @FindBy(xpath = "//h1[@class=\"tzy4Gg AinsX6 vipNKb\"]")
    public WebElement evénementsTitre;

    @FindBy(xpath = "(//a[@class=\"DjQEyU m022zm aUkG34\"])[1]")
    public WebElement enSavoirPlus;

    @FindBy(xpath = "(//h1[@class=\"word-wrap-break\"])[1]")
    public WebElement iso;

    @FindBy(id="training-series-times")
    public WebElement dateDropDown;

    @FindBy(xpath = "(//input[@class=\"form-control maxCharLimit\"])[1]")
    public WebElement prenomBox;

    @FindBy(xpath = "(//input[@class=\"form-control maxCharLimit\"])[2]")
    public WebElement nomBox;

    @FindBy(xpath = "(//input[@class=\"form-control maxCharLimit\"])[3]")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@class=\"InputElement is-empty Input Input--empty\"])[1]")
    public WebElement numeroDeCarte;

    @FindBy(xpath = "(//div[@class=\"empty input payment-fields StripeElement StripeElement--empty\"])[1]")
    public WebElement dateDexpiration;

    @FindBy(xpath = "(//div[@class=\"empty input payment-fields StripeElement StripeElement--empty\"])[2]")
    public WebElement cvv;

    @FindBy(xpath = "//span[@class=\"message\"]")
    public WebElement message;

    @FindBy(xpath = "//span[@data-bind=\"text: submitBtnText\"]")
    public WebElement payerButton;


    //driver.switch_to.iframe(//iframe[@title="Wix Chat"]

    @FindBy(xpath = "//iframe[@title=\"Wix Chat\"]")
    public WebElement voisSouhaitezDiscuter;








}




