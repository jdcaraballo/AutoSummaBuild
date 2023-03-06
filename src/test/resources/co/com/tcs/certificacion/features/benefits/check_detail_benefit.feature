
Feature: Consultar detalle de Beneficios por colaboradores
  Yo como Gestor Senior
  quiero consultar los detalles de los Beneficios vigentes
  para visualizar los Beneficios actualizados

  Background: Inicio Sesión como Gestor Senior
    Given que el Gestor Senior de Beneficios inicia sesion con usuario jcaraballo@summa-sci.com con clave S4p+*2022++**

  Scenario: Consultar Beneficios por CEDULA
    When el consulta beneficios de cedula 1048017433
    Then se veran los beneficios en pantalla

  Scenario: Consultar Beneficios NOMBRE
    When el consulta beneficios por nombre David
    Then se veran los beneficios en la pantalla

  Scenario: Consultar Beneficios por CEDULA Inexistente
    When el consulta los beneficios de cedula inexistente  11462240012
    Then se vera mensaje: no hay datos disponibles

  Scenario: Consultar  por TIPO DE BENEFICIO
    When el consulta beneficios en Filtro Tipo de beneficio BENEFLEX
    Then se veran los beneficios en la pantalla

  Scenario: Consultar Beneficios por COMPAÑÍA
    When el consulta por filtro Compania CELSIA
    Then se veran los beneficios del colaborador en pantalla

  Scenario: Consultar Beneficios por Filtro Auxilios
    When el consulta por Filtro Auxilios Ahorro Fomente
    Then se vera listado de beneficios de Auxilios

    Scenario: Consultar Beneficios por Filtro Pólizas
    When el consulta por Tipo de Beneficios Polizas Poliza de Salud
    Then se veran los beneficios del colaborador en pantalla