
Feature: Gestionar Roles para acceso de los colaboradores
  Yo como Gestor/Admin
  quiero gestionar los perfiles de los colaboradores
  para validar permisos y restricciones de cada rol


  Background: Inicio Sesión como Gestor Senior/Admin
    Given que el Gestor Senior/Admin inicia la sesion con usuario jcaraballo@summa-sci.com con clave S4p+*2022++**

  Scenario: Creación Rol Admin
    When el gestor/admin crea un nuevo rol de Admin RolAdmin_P_07
    Then se vera nuevo rol en la pantalla

  Scenario: Creación Rol Gestor
    When el gestor/admin crea un nuevo rol de Gestor RolGestor P_07
    Then se vera nuevo rol en pantalla

  Scenario: Creación Rol Auxiliar
    When el gestor/admin crea un nuevo rol de Auxiliar RolAuxiliar_P_07
    Then se puede ver nuevo rol en la pantalla

  Scenario: Creación Rol Basic
    When el gestor/admin crea un nuevo rol de Basic RolBasic_P_07
    Then se podra ver nuevo rol en la pantalla

  Scenario: Creación Rol Otro
    When el gestor/admin crea un nuevo rol de Otro RolOtro_P_07
    Then se vera nuevo rol Otro en la pantalla

  Scenario: Creación Rol Otro sin nombre (vacío/null)
    When el gestor/admin crea un nuevo rol Null
    Then se vera mensaje Este campo es obligatorio en la pantalla