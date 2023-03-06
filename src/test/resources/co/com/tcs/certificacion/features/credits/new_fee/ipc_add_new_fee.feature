
Feature: LOGIN
  Yo como usuario
  quiero iniciar sesion en el portal creditos
  para navegar en la pantalla del modulo de creditos

  Scenario: LOGIN
    Given que el abre pagina principal
    When el inicia sesion con usuario upruebas2@summa-sci.com con clave David-2820*
    Then se vera pantalla de inicio del gestor senior