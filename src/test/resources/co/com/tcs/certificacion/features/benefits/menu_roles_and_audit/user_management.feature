
Feature: Gestionar perfiles de los colaboradores
  Yo como Usuario
  quiero gestionar los perfiles de los colaboradores
  para validar permisos y restricciones de cada perfil

  Background: Inicio Sesión como Gestor Senior/Admin
    Given que el Gestor Senior/Admin inicia sesion con usuario jcaraballo@summa-sci.com con clave S4p+*2022++**

  Scenario: Crear usuario con perfil Admin
    When el gestor/administrador crea un nuevo usuario test.admin_11@summa-sci.com con rol de Admin
    Then se vera nuevo usuario en pantalla

  Scenario: Crear usuario con perfil Gestor
    When el gestor/admin crea un nuevo usuario test.gestor_11@gmail.com.com con rol de Gestor
    Then se vera nuevo usuario en la pantalla

  Scenario: Crear usuario con perfil Auxiliar
    When el gestor/admin crea nuevo usuario test.auxiliar_11@summa.com con rol de Auxiliar
    Then se puede ver nuevo usuario en la pantalla

  Scenario: Crear usuario con perfil Multi Rol (Admin/Gestor/Auxiliar/Basic)
    When el gestor/admin crea un nuevo usuario test.multirol_11@test.com con Multi Rol Gestor - Admin - Auxiliar
    Then se podra ver nuevo usuario en la pantalla

  Scenario: Crear usuario con perfil rol Admin con correo Failed
    When el gestor/admin intenta crear un nuevo usuario fallido test.mail_failed_11@test con Rol Gestor
    Then se vera mensaje de error en la pantalla

  Scenario: Crear usuario con perfil sin Rol
    When el gestor/admin intenta crear un nuevo usuario test.not_rol_11@test.com sin rol
    Then se vera mensaje de error en pantalla por ausencia de rol