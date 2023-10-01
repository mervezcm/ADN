package com.adn.stepdefinitions;

import com.adn.pages.ContactPage;
import com.adn.utilities.ConfigurationReader;
import com.adn.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contact_StepDefinitions {
    ContactPage contactPage=new ContactPage();

    @Given("L'utilisateur entre sur la page d'accueil")
    public void l_utilisateur_entre_sur_la_page_d_accueil() {

        Driver.getDriver().get(ConfigurationReader.getProperty("website"));

    }
    @When("L'utilisateur clique sur le menu de contact.")
    public void l_utilisateur_clique_sur_le_menu_de_contact() {
        contactPage.contactTitre.click();

    }
    @When("L'utilisateur remplit le champ du nom.")
    public void l_utilisateur_remplit_le_champ_du_nom() {
contactPage.nom.sendKeys("Edoardo");
    }
    @When("L'utilisateur remplit le champ de l'adresse e-mail.")
    public void l_utilisateur_remplit_le_champ_de_l_adresse_e_mail() {
contactPage.email.sendKeys("rusooedo@hotmail.com");
    }
    @When("L'utilisateur entre le numéro de téléphone.")
    public void l_utilisateur_entre_le_numéro_de_téléphone() {
contactPage.telephone.sendKeys("+313515896325");
    }
    @When("L'utilisateur écrit son message dans la boîte de message.")
    public void l_utilisateur_écrit_son_message_dans_la_boîte_de_message() {
contactPage.message.sendKeys("Hello, I would like to you about upcoming events");
    }
    @Then("L'utilisateur clique sur le bouton Envoyer.")
    public void l_utilisateur_clique_sur_le_bouton_envoyer() {
contactPage.envoyer.click();
    }
}
