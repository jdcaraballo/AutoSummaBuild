
Feature: Logout from menu aside
  Yo como usuario
  quiero cerrar sesion delde el boton del menu el portal
  para navegar en la pantalla del portal

  Scenario: Logout from DirAct menu aside
    Given que el abre pagina de Expocolaborador
    When el cierra sesion desde el DA con usuario jcaraballo@summa-sci.com con clave S4p+*2022++**
    Then se vera pantalla inicio