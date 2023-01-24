 # language: es

Característica: Buscar en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder buscar servicios por el nombre


  @busquedas
  Esquema del escenario: Hacer busquedas desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp
    Cuando ingresa una palabra al buscador
      | datoBusqueda   |
      | <datoBusqueda> |
    Entonces aparecen los servicios con esa palabra '<datoBusqueda>'

    Ejemplos:
      | datoBusqueda       |
      | Eventos y jornadas |