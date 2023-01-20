# language: es

Característica: Ver noticias en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder ver las noticias


  @Noticias
  Esquema del escenario: Ver las noticias desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp
    Cuando hace clic sobre el boton de notcias y filtra por una categoria o más categorias
      | filtro   |
      | <filtro> |
    Entonces me muestra las noticias de esa categoria

    Ejemplos:

      | filtro                        |
      | DAGRD                         |
      | DAP                           |
      | Despacho de la Gestora Social |
      | Despacho del Alcalde          |
