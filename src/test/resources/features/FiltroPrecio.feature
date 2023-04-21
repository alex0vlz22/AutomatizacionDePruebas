Feature: Yo como usuario necesito filtrar por precio los vuelos

  Scenario: Filtrar por precio
    Given Se navega hacia "https://demo.testim.io/destinations"
    When La página ha cargado completamente
    And Seleccionar el precio “623”
    Then Validar que los planetas listados sean de precio menor a “623”
