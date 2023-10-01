@formation
Feature:L'utilisateur doit pouvoir s'inscrire à n'importe quelle formation.

  Scenario: L'utilisateur devrait pouvoir voir le titre de la formation sur la page d'accueil.
    Given L'utilisateur arrive sur la page principale
    Then  L'utilisateur voit le titre de la formation.
  Scenario: L'utilisateur devrait pouvoir voir le titre "Événement à venir.
    Given L'utilisateur arrive sur la page principale
    When  L'utilisateur clique sur le titre de la formation.
    Then  L'utilisateur voit les titres des événements à venir.
  Scenario: L'utilisateur ne devrait pas pouvoir s'inscrire à un événement sous le titre "Événement à venir" avec de fausses informations d'identification.
    Given L'utilisateur arrive sur la page principale
    And L'utilisateur clique sur le titre de la formation.
    And  L'utilisateur clique sur le bouton "En savoir plus" pour en savoir plus sur l'événement.
    #Then L'utilisateur voit le formulaire d'inscription à l'événement.
    When L'utilisateur choisit la date de l'événement.
    And L'utilisateur écrit le nom.
    And L'utilisateur écrit le nom de famille.
    And L'utilisateur écrit l'adresse e-mail.
    And L'utilisateur saisit un mauvais numéro de carte de crédit.
    Then L'utilisateur voit le message d'avertissement.
    And L'utilisateur ne peut pas s'inscrire aux événements.




