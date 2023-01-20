# language: es

Característica: Buscar empleos en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder buscar empleos


  @BuscadaDeVacante
  Esquema del escenario: Hacer busqueda de empleos desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para buscar un empleo
    Cuando hace clic sobre el boton de empleos e ingresa una palabra al buscador
      | empleo   |
      | <empleo> |
    Entonces aparecen los empleos con esa palabra '<empleo>'

    Ejemplos:
      | empleo                |
      | Coordinador Comercial |

  @MedellinJoven
  Esquema del escenario: Inscribirse a Medellin joven desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para inscribirse en Medellin Joven
    Cuando hace clic sobre el boton de Medellin Joven y buscar por categoria y filtrar por comuna y escoger una convocatoria
      | categoria   | comuna   |
      | <categoria> | <comuna> |
    Entonces podrá ver información de la convocatoria
    Ejemplos:
      | categoria                    | comuna            |
      | Artes, Cultura y Humanidades | Comuna 5 - Castilla |