
Feature: Registrar Usuarios
  Yo como usuario
  quiero registrarme en la pagina
  para comprar productos

  Scenario: Registrar Usuarios
    Given que abro la pagina demoblaze
    When registro usuario prueba123@gmail.com con clave Prueba1234
    Then El cliente vera registro exitoso