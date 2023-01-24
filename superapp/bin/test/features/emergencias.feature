# language: es

Característica: Marcar a emergencias en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder llamar a emergencias


  @emergencias
  Escenario: Llamar a emergencias desde la aplicacion superapp
    Dado que Ismael ingresa a la aplicacion superapp
    Cuando selecciona el boton de emergencias
    Cuando selecciona el boton de llama ya
    Entonces se redirige al teclado del telefono
