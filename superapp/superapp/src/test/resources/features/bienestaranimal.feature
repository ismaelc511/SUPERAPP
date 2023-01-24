# language: es

Característica: Reportar animales, adoptar animales y mostrar eventos de animales
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero reportar animales, adoptar animales y mostrar eventos de animales


  @Bienestar-animales-Reportar-animal-extraviado
  Esquema del escenario: Reportar animal extraviado desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para reportar un animal extraviado
    Cuando hace clic sobre el boton de reportar animales extraviados e ingresa los datos
      | nombreAnimal   | especie   | raza   | sexo   | tamanio   | caracteristicas   | numeroMicrochip   | txtMicrochip   |
      | <nombreAnimal> | <especie> | <raza> | <sexo> | <tamanio> | <caracteristicas> | <numeroMicrochip> | <txtMicrochip> |
    E ingresa ubicacion y contacto
      | direccionExtravio   | puntoReferencia   | comuna   | barrio   | nombrePropietario   | numeroContacto   | correo   |
      | <direccionExtravio> | <puntoReferencia> | <comuna> | <barrio> | <nombrePropietario> | <numeroContacto> | <correo> |
    Entonces aparece un pop-up con la confirmacion

    Ejemplos:
      | nombreAnimal | especie | raza  | sexo  | tamanio | caracteristicas | direccionExtravio | puntoReferencia | comuna              | barrio    | nombrePropietario | numeroContacto | correo          | numeroMicrochip | txtMicrochip         |
      | Lucas        | Bulldog | mixta | Macho | Grande  | Labrador        | Cl 22             | Cerca al parque | Comuna 5 - Castilla | Florencia | Oscar             | 3225556985     | oscar@gmail.com | 123456          | Número del microchip |


  @Bienestar-animales-Adopcion-de-Animales
  Escenario: Adopcion de animales desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para adoptar un animal
    Cuando hace clic sobre el boton de filtrar animales de compania
    Entonces aparecen los animales filtrados


  @Bienestar-animal-Eventos-Y-Jornadas
  Escenario: Ver jornadas de adopcion desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para ver jornadas de adopcion
    Cuando hace clic en el boton de eventos y jornadas
    Entonces prodrá ver los diferentes eventos que estan programados


  @Bienestar-animal-Ver-Animales-Extraviados
  Esquema del escenario: Ver animales extraviados en la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para ver animales extraviados
    Cuando hace clic en el boton de ver animales extraviados
      | email   | password   | telefono   | nombre   | direccion   |
      | <email> | <password> | <telefono> | <nombre> | <direccion> |
    Entonces prodrá ver los animales extraviados
    Ejemplos:
      | email      | password  | telefono | nombre | direccion       |
      | 1080935788 | Ismael08@ | 123456   | damian | cerca al parque |
