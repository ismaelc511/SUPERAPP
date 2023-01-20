# language: es

Característica: Ver impuestos en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder ver los impuestos


  @Impuestos
  Esquema del escenario: Ver los impuestos desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp
    Cuando hace clic sobre el boton de impuestos e inicia sesion
      | email   | password   |
      | <email> | <password> |
    Cuando elije el periodo y el año
      | elegirPeriodo   | anualidad   |
      | <elegirPeriodo> | <anualidad> |
    Entonces se muestra la página de impuestos y el texto 'Impuesto Predial'

    Ejemplos:

      | email      | password  | elegirPeriodo | anualidad |
      | 1080935788 | Ismael08@ | 1er Trimestre | 2022      |

  @IndustriaYComercio
  Esquema del escenario: Consultar la industria y comercio desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp para inductria y comercio
    Cuando hace clic sobre el boton de impuestos e inicia sesion para ingresar a Industria y comercio
      | email   | password   |
      | <email> | <password> |
    Cuando ingresa a tramites ágiles e impuestos y presiona industria y comercio
    Entonces podrás ver un certificado y el texto 'Certificado'

    Ejemplos:

      | email      | password  |
      | 1080935788 | Ismael08@ |

  @BotonDePagos
  Esquema del escenario: Consultar el Boton de Pagos desde la aplicacion superapp
    Dado que Ismael ingresa al perfil de la app para ver botón de pagos
    Cuando hace clic sobre el boton de impuestos e inicia sesion para ingresar a Botón de Pagos
      | email   | password   |
      | <email> | <password> |
    Cuando ingresa a tramites ágiles e impuestos y presiona botón de pagos
    Entonces podrás ver pago de impuestos e historial de transacciones

    Ejemplos:

      | email      | password  |
      | 1080935788 | Ismael08@ |