
Feature: Consultar detalle de credito de colaboradores
  Yo como Gestor Senior
  quiero consultar los detalles de los créditos vigentes
  para validar en contabilidad

Background: Inicio Sesión como Gestor Senior
  Given que el Gestor Senior de Creditos inicia sesion con usuario upruebas2@summa-sci.com con clave yVdDMmTvpjo3T5%

  Scenario: Ver detalle de credito del colaborador consultado por COMPAÑÍA
    When el consulta detalles del credito por Compania SUMMA SERV. CORP. INTEGRALES
    Then se vera en pantalla el credito del colaborador por Compania

  Scenario: Ver detalle de credito del colaborador consultado por cédula
    When el consulta detalles del credito por cédula 1128269310 abona 20000 al interes y 100000 al capital
    Then se vera en pantalla el credito del colaborador con esa cedula
#
#  Scenario: Ver detalle de credito del colaborador consultado por nombre
#    When el consulta detalles del credito por nombre Isabel Cristina
#    Then se vera el detalle del credito por nombre en pantalla
#
#  Scenario: Ver detalle de credito del colaborador consultado por apellido
#    When el consulta detalles del credito por apellido Rios
#    Then se vera el detalle del credito por apellidos en pantalla












#
#  Scenario: Consultar Crédito COMPAÑÍA NO Existente
#    When el consulta credito por compania SUMMASDF NO Existente
#    Then se vera pantalla SIN carga de creditos
#
#    Scenario: Consultar Crédito por IDENTIFICACION
#    When el consulta credito de cedula 1014221461
#    Then se vera en pantalla el credito del colaborador con esa cedula
#
#  Scenario: Consultar Crédito por NOMBRE EXISTENTE
#    When el consulta credito por nombre de JUAN MANUEL
#    Then se vera en pantalla el credito del colaborador con ese nombre
#
#
#  Scenario: Consultar Crédito por APELLIDO
#    When el consulta credito por APELLIDO de PUERTA
#    Then se vera en pantalla el credito del colaborador con ese APELLIDO
#
#  Scenario: Consultar Crédito por CONSECUTIVO
#    When el consulta credito por CONSECUTIVO de 202200002164
#    Then se vera en pantalla el credito del colaborador con ese CONSECUTIVO
#
#  Scenario: Consultar Crédito por SALDO ACTUAL
#    When el consulta credito por SALDO ACTUAL de 1000000
#    Then se vera en pantalla el credito del colaborador con ese SALDO ACTUAL