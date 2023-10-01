@contact
Feature:"L'utilisateur doit pouvoir utiliser le menu de contact sur la page d'accueil."
        #"The user should be able to use the contact menu on the homepage."

  Scenario:L'utilisateur doit pouvoir contacter le site en remplissant les champs nécessaires.
    #The user should be able to contact the website by filling out the necessary fields.
    Given L'utilisateur entre sur la page d'accueil
  #The user enters the homepage.
    When L'utilisateur clique sur le menu de contact.
    #The user clicks on the contact menu.
    And L'utilisateur remplit le champ du nom.
    #The user fills out the name field.
    And L'utilisateur remplit le champ de l'adresse e-mail.
    #The user fills out the email field.
    And L'utilisateur entre le numéro de téléphone.
    #The user enters the phone number.
    And L'utilisateur écrit son message dans la boîte de message.
    #The user writes their message in the message box.
    Then L'utilisateur clique sur le bouton Envoyer.
    #The user clicks on the send button.