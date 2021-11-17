# Autor:Robinson
@stories
Feature: utest
  As a developer I will automate the registration of the utest page

  @scenario:
  Scenario Outline: search for automation on the utest page
    Given click register

    When  record of each steps
      | strPrimerNombre   | strPrimerApellido   | strCorreo   |  strClave   | strConfirmarClave   |
      | <strPrimerNombre> | <strPrimerApellido> | <strCorreo> | <strClave> | <strConfirmarClave> |
    Then verify that the user registration is correct

    Examples:
      | strPrimerNombre | strPrimerApellido | strCorreo                   | strClave       | strConfirmarClave |
      | Robinson        | Tique             | robins.david.tique@gmail.com|robin0999*         | robin0999*  |
