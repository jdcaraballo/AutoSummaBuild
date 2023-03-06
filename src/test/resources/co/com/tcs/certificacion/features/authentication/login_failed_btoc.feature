
Feature: Login failed from B to C
  Yo como usuario
  quiero iniciar sesion en el portal con credenciales inválidas desde el B to C
  para validar falla al ingreso al portal

  Scenario: Login failed from B to C
    Given que el Gestor abre pagina principal
    When el inicia sesion desde el B to C con usuario invalido failed_btoc@summa-sci.com con clave David-2820*
    Then se vera mensaje de falla al ingreso al portal