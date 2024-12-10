@listlivre
Feature: Gestion des livres
  @dispolivre
  Scenario: Affichage des livres disponibles
    Given je suis un utilisateur connecte
    When je consulte la liste des livres
    Then je devrais voir tous les livres disponibles a la bibliotheque
