Feature: Yo como usuario necesito agregar un viaje

  Scenario: Compra carrito
    Given Se navega hacia "https://demo.testim.io/destinations"
    When La página ha cargado completamente
    And Dar Clic en el enlace del book
    And complete todos los campos requerido
    And pongo un codigo de descuento
    Then El carrito aparecerá con tu compra
    Then Cerrar navegador