Feature: US_000 Commander un plat

  Scenario: Supprimer plat
    Given la suppression d'un plat necessite l'existance d'un plat
    When l'utilisateur la supprime
    Then le plat est retire du menu

  Scenario: Modifier plat
    Given la modification d'un plat necessite l'existence d'un plat
    When l'utilisateur la modifie
    Then le plat est modifie