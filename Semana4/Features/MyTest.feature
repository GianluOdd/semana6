Feature: Realización de casos ingresando nombre de usuario y contraseña
Scenario: verificación de ingreso de sesión
Given abrir chrome
When ingresa Username "user" Password "user"
Then inicia sesion