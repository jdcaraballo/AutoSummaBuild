
Feature: Logout from Dir Act
  Yo como usuario
  quiero cerrar sesion en el portal
  para navegar en la pantalla del portal

  Scenario: Logout from Dir Act
    Given que el abre pagina Expocolaborador
    When el cierra la sesion desde el DA con usuario jcaraballo@summa-sci.com con clave S4p+*2022++**
    Then se vera pantalla de inicio