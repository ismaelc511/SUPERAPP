# language: es

Característica: Autenticacion correcta en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder autenticarme exitosamente

  @Login
  Esquema del escenario: Validar ingreso correcto a la aplicacion de SuperApp
    Dado que Ismael ingresa al perfil de la app para loguearse
    Cuando ingresa sus credenciales de la app
      | email   | password   |
      | <email> | <password> |
    Entonces el valida que el usuario autenticado es nombre_test1 apellido_test1
    Y cierra sesion de superapp

    Ejemplos:
      | email      | password  |
      | 1080935788 | Ismael08@ |

  @LoginFacebook
  Esquema del escenario: Validar ingreso correcto desde Facebook a la aplicacion de SuperApp
    Dado que Ismael ingresa al perfil de la app
    Cuando selecciona el boton de facebook e ingresa sus credenciales de facebook
      | email   | password   |
      | <email> | <password> |
    Entonces el valida el usuario autenticado con facebook es Open User
    Y cierra sesion de superapp desde facebook
    Ejemplos:
      | email                       | password     |
      | open_ldpkera_user@tfbnw.net | Contraseña1* |

  @LoginGoogle
  Escenario: Validar ingreso correcto desde Google a la aplicacion de SuperApp
    Dado que Ismael ingresa al perfil de la app para loguearse a traves de Google
    Cuando selecciona el botón de Cuenta de Google
    Entonces el valida que el usuario autenticado con Google es ISMAEL ALEXANDER CARVAJAL GONZALEZ
    Y cierra sesion de Google

  @LoginLinkedin
  Esquema del escenario: Validar ingreso correcto desde Linkedin a la aplicacion de SuperApp
    Dado que Ismael ingresa al perfil de la app para loguearse a traves de Linkedin
    Cuando selecciona el boton de linkedin e ingresa sus credenciales de linkedin
      | email   | password   |
      | <email> | <password> |
    Entonces el valida que el nombre del usuario autenticado con linkedin es ISMAEL ALEXANDER CARVAJAL GONZALEZ
    Y cierra sesion de superapp desde linkedin
    Ejemplos:
      | email                   | password  |
      | ismaelc@unicauca.edu.co | ismael07 |