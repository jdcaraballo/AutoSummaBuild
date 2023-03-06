
Feature: Login failed from Dir Act
  Yo como usuario
  quiero iniciar sesion en el portal con credenciales inválidas
  para validar falla al ingreso al portal

  Scenario: Login failed from Dir Act
    Given que se abre pagina principal
    When el inicia sesion desde el DA con un usuario invalido failupruebas2@summa-sci.com con clave David-2820*
    Then se vera falla al ingreso al portal