
Feature: Logout from B2C
  Yo como usuario
  quiero cerrar sesion en el portal
  para navegar en la pantalla del aplicativo

  Scenario: Logout from B2C
    Given que el abre pagina principal del app
    When el cierra sesion desde el B2C con usuario  prueba.test.qa.123@gmail.com con clave Prueba1234
    Then se vera pantalla de homepage