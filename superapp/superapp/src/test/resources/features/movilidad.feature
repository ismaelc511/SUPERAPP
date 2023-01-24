# language: es

Característica: Ver info de pico y placa y multas en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder ver informacion de pico y placa y de multas


  @Movilidad-Info-Pico-Y-Placa
  Esquema del escenario: Ver info de pico y placa desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp
    Cuando hace clic sobre el boton de info de Pico y Placa y digita la placa
      | placa   |
      | <placa> |
    Entonces me muestra informacion sobre Pico y Placa

    Ejemplos:

      | placa |
      | DAGRD |

  @Movilidad-Consulta-Y-Pago-De-Multa
  Esquema del escenario: Consultar y pago de multa desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp para consultar y pagar multas
    Cuando hace clic sobre el boton de Consulta y pago de multas
      | email   | password   | cedula   |
      | <email> | <password> | <cedula> |
    Entonces me muestra informacion sobre multas

    Ejemplos:

      | email      | password  | cedula     |
      | 1080935788 | Ismael08@ | 1080935788 |

  @Movilidad-Consulta-De-Exentos
  Esquema del escenario: COnsultar exentos de multas desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp para consultar exentos de multas
    Cuando hace clic sobre el boton de consultar de exentos
      | placa   |
      | <placa> |
    Entonces me muestra informacion sobre Exentos

    Ejemplos:

      | placa |
      | DAGRD |
