# language: es

Característica: Ver eventos en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder ver los eventos


  @Eventos
  Esquema del escenario: Ver los eventos desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp
    Cuando hace clic sobre el boton de eventos y filtra por una categoria o más categorias
      | filtro   |
      | <filtro> |
    Entonces me muestra los eventos de esa categoria

    Ejemplos:

      | filtro                                                    |
      | DAGRD                                                     |
      | DAP                                                       |
      | Despacho de la Gestora Social                             |
      | Gerencia de Diversidades Sexuales e Identidades de Género |