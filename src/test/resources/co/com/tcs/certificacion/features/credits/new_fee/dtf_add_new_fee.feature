
Feature: Agregar nuevas tarifas para cobros de créditos
  Yo como Gestor Senior
  quiero actualizar el interés DTF para el periodo diferente al actual
  para validar generación de cálculos y cobro de cuotas a los usuarios

  Background: Inicio Sesión como Gestor Senior
    Given que el Gestor de Creditos inicia sesion con usuario upruebas2@summa-sci.com con clave yVdDMmTvpjo3T5%
#    Given que el Gestor Senior de Creditos inicia sesion con usuario jd.caraballoo@gmail.com con clave David2820*

  Scenario Outline: Agregar interés DTF con fecha del próximo periodo (2023)
    When el agrega fecha del proximo peridio 2023 con los siguientes valores
      | description   | initialDate   | finalDate   | feeValue   |
      | <description> | <initialDate> | <finalDate> | <feeValue> |
    Then se vera mensaje de interes cargado con exito


    Examples:
      | description | initialDate | finalDate  | feeValue |
      | DTF 2023 01 | 01/01/2023  | 31/12/2023 | 5,500    |