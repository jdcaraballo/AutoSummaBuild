
Feature: Login from B2C
  Yo como usuario
  quiero iniciar sesion desde el B2C en el portal
  para navegar en la pantalla

  Scenario: Login from B2C
    Given que el abre la pagina principal
    When el inicia sesion con usuario  prueba.test.qa.123@gmail.com con clave Prueba1234
    Then se vera la pantalla de inicio del gestor senior