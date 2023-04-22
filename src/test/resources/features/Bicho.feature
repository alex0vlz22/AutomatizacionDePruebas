Feature: Yo como usuario necesito iniciar sesión con usuario y contraseña válidos

  Scenario: Iniciar sesión exitosa
    Given Se navega hacia "https://demo.testim.io/destinations"
    When La página ha cargado completamente
    And Dar Clic en el enlace del LOGIN
    And Llenar el campo de usuario como “jhon”
    And Llenar el campo contraseña cómo “123”
    And Dar Clic en el botón LOGIN
    Then Validar que el usuario aparezca en la parte superior derecha
    Then Cerrar navegador



