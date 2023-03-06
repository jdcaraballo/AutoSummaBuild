
Feature: Editar  Monto del valor del Beneficio seleccionado
  Yo como Gestor Senior
  quiero editar el monto seleccionado de los Beneficios colaborador
  para mantener Beneficios actualizados

  Background: Inicio Sesión como Gestor Senior
    Given que el Gestor de Beneficios inicia sesion con usuario jcaraballo@summa-sci.com con clave S4p+*2022++**

  Scenario: Editar valor de Beneficio por CEDULA
    When el edita beneficios de cedula 43094988 cambia el monto seleccionado por 654321,011
    Then se veran los beneficios del colaborador en pantalla

  Scenario: Editar valor de Beneficio NOMBRE
    When el edita beneficios por nombre ERIKA MARIA GONZALEZ ZULUAGA cambia el monto seleccionado por 4321,51
    Then se veran los beneficios en la interfaz

  Scenario: Editar valor de Beneficio Auxilios con Valor negativo
    When el edita beneficios en Filtro cedula 42133549 cambia el monto seleccionado negativo de -125000
    Then se vera mensaje de error en pantalla

  Scenario: Editar valor de Beneficio Auxilios con Valor cero
    When el edita beneficios en Filtro cedula 1088000397 cambia el monto seleccionado por 0
    Then se vera mensaje de error

#  Scenario: Consultar Beneficios por MONTO DEL BENEFICIO
#    When el consulta por Tipo de  Beneficios de Beneflex
#    Then se veran los beneficios del colaborador en pantalla

#  Scenario: Consultar Beneficios por COMPAÑÍA
#    When el consulta por Tipo de  Beneficios de Beneflex
#    Then se veran los beneficios del colaborador en pantalla
