# language: es

Característica: Registro de usuario en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder registrarme exitosamente


  @Register
  Esquema del escenario: Validar registro correcto en la aplicacion de SuperApp
    Dado que Ismael ingresa para registrarse en al perfil de la app
    Cuando selecciona el boton de registro e ingresa su informacion personal
      | tipo persona   | nombres   | apellidos   | tipoDocumento   | numero documento   | dia nacimiento   | mes nacimiento   | año nacimiento   | correo   | genero   | numero celular   | numero fijo   | sexo   | etnia   | orientacion sexual   | identidad de genero   |
      | <tipo persona> | <nombres> | <apellidos> | <tipoDocumento> | <numero documento> | <dia nacimiento> | <mes nacimiento> | <año nacimiento> | <correo> | <genero> | <numero celular> | <numero fijo> | <sexo> | <etnia> | <orientacion sexual> | <identidad de genero> |
    Cuando ingresa su informacion complementaria
      | pais de residencia   | departamento   | municipio   | barrio   |
      | <pais de residencia> | <departamento> | <municipio> | <barrio> |
    Cuando ingresa su direccion
      | tipoVia   | numeroVia   | apendiceVia   | orientacionVia   | numeroCruce   | apendiceCruce   | orientacionCruce   | numero   | complemento   | direccionDescriptiva   | direccionIngresada   |
      | <tipoVia> | <numeroVia> | <apendiceVia> | <orientacionVia> | <numeroCruce> | <apendiceCruce> | <orientacionCruce> | <numero> | <complemento> | <direccionDescriptiva> | <direccionIngresada> |
    Entonces el recibe una notificacion de que se envio la contraseña al correo con el texto 'Registro Exitoso'

    Ejemplos:
      | tipo persona      | tipoDocumento | dia nacimiento | mes nacimiento | año nacimiento | genero    | sexo   | etnia      | orientacion sexual | identidad de genero | pais de residencia | departamento | municipio      | barrio  | tipoVia   | numeroVia | apendiceVia | orientacionVia | numeroCruce | apendiceCruce | orientacionCruce | numero | complemento     | direccionDescriptiva | direccionIngresada |
      | N-Persona Natural | T.I           | 2              | 3              | 2022           | Masculino | Hombre | Palenquero | Heterosexual       | Otro                | CO-Colombia        | 05-ANTIOQUIA | 05001-MEDELLIN | Toscana | Autopista | 2         | A           | Norte          | 2           | AB            | Este             | 5      | cerca al centro | carrera central      | carrera            |