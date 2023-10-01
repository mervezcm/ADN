package com.adn.step_definitions;

import com.adn.pages.FormationPage;
import com.adn.utilities.BrowserUtilities;
import com.adn.utilities.ConfigurationReader;
import com.adn.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.Select;

public class Formation_StepDefinitions {
 FormationPage formationPage= new FormationPage();
    @Given("L'utilisateur arrive sur la page principale")
    public void l_utilisateur_arrive_sur_la_page_principale() {
        Driver.getDriver().get(ConfigurationReader.getProperty("website"));
    }

    @Then("L'utilisateur voit le titre de la formation.")
    public void l_utilisateur_voit_le_titre_de_la_formation() {
       System.out.println("Formation titre : " + formationPage.formationTitre.getText());
       Assert.assertEquals(formationPage.formationTitre.getText(),"FORMATION");

    }


    @When("L'utilisateur clique sur le titre de la formation.")
    public void l_utilisateur_clique_sur_le_titre_de_la_formation() {
     formationPage.formationTitre.click();
    }

    @Then("L'utilisateur voit les titres des événements à venir.")
    public void l_utilisateur_voit_les_titres_des_événements_à_venir() {
       System.out.println(formationPage.evénementsTitre.getText());
       Assert.assertEquals(formationPage.evénementsTitre.getText(),"Événements à venir");


    }


    @Given("L'utilisateur clique sur le bouton {string} pour en savoir plus sur l'événement.")
    public void l_utilisateur_clique_sur_le_bouton_pour_en_savoir_plus_sur_l_événement(String string) {

        formationPage.enSavoirPlus.click();

       // BrowserUtilities.switchWindowAndVerify("https://register.gotowebinar.com/rt/8759938212957136989","Initiation à la norme NF EN ISO 13485 partie I/II");

    }

   /* @Then("L'utilisateur voit le formulaire d'inscription à l'événement.")
    public void l_utilisateur_voit_le_formulaire_d_inscription_à_l_événement() {
       System.out.println(formationPage.iso.getText());
  BrowserUtilities.sleep(2);
       Assert.assertEquals("Initiation à la norme NF EN ISO 13485 partie I/II",formationPage.iso.getText());
    }*/

    @When("L'utilisateur choisit la date de l'événement.")
    public void l_utilisateur_choisit_la_date_de_l_événement() {
        BrowserUtilities.sleep(2);
            formationPage.dateDropDown.click();

       Select dateDropdown =new Select(formationPage.dateDropDown);
       dateDropdown.selectByVisibleText("mar. 17 oct. 2023 10:00 - 19:00 +03");
        BrowserUtilities.scrollToElement(formationPage.prenomBox);
    }

    @When("L'utilisateur écrit le nom.")
    public void l_utilisateur_écrit_le_nom() {
        formationPage.prenomBox.sendKeys("Edoardo");

    }

    @When("L'utilisateur écrit le nom de famille.")
    public void l_utilisateur_écrit_le_nom_de_famille() {
        formationPage.nomBox.sendKeys("Russo");

    }

    @When("L'utilisateur écrit l'adresse e-mail.")
    public void l_utilisateur_écrit_l_adresse_e_mail() {
formationPage.emailBox.sendKeys("russoedo@hotmail.com");
    }
    @And("L'utilisateur saisit un mauvais numéro de carte de crédit.")
    public void lUtilisateurSaisitUnMauvaisNumeroDeCarteDeCredit() {
        formationPage.numeroDeCarte.sendKeys("124567894561");
    }
    @Then("L'utilisateur voit le message d'avertissement.")
    public void l_utilisateur_voit_le_message_d_avertissement() {
        System.out.println(formationPage.message.getText());
        Assert.assertEquals("Votre numéro de carte n'est pas valide.",formationPage.message.getText());
    }



}
