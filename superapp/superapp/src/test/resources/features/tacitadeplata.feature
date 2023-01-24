# language: es

Característica: Conocer dias y horarios de recoleccion de basura
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero conocer horarios de recoleccion de basura


  @Tacita-De-Plata
  Esquema del escenario: Conocer recoleccion de basura desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para conocer los horarios de recoleccion de basura
    Cuando hace clic sobre reporte tacita de plata y selecciona un barrio
      | barrio   |
      | <barrio> |
    Y elige la ruta deseada
      | ruta   |
      | <ruta> |
    Entonces aparece un pop-up con el horario

    Ejemplos:
      | barrio      | ruta         |
      | Aguas Frías | Ruta Z6R51WS |