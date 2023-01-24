# language: es

Característica: Realizar reportes ciudadanos en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder hacer reportes


  @ReportesCiudadanos-RealizarPQRSD
  Esquema del escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para hacer un reporte
    Cuando hace clic sobre reporte ciudadanos y realiza una PQRSD
      | tipoPersona   | tipoDocumento   | numeroDocumento   | nombres   | apellidos   | genero   | pais   | departamento   | ciudad   | indicativoVia   | numeroVia   | apendice   | orientacion   | numeroCruce   | apendice2   | orientacion2   | numeroPuerta   | interior   | email   | telefono   | solicitudInformacion   |
      | <tipoPersona> | <tipoDocumento> | <numeroDocumento> | <nombres> | <apellidos> | <genero> | <pais> | <departamento> | <ciudad> | <indicativoVia> | <numeroVia> | <apendice> | <orientacion> | <numeroCruce> | <apendice2> | <orientacion2> | <numeroPuerta> | <interior> | <email> | <telefono> | <solicitudInformacion> |
    Y hace clic en continuar e ingresa la siguiente informacion
      | atencionPreferencial   | indicativoVia   | numeroVia   | apendice   | orientacion   | numeroCruce   | apendice2   | orientacion2   | numeroPuerta   | interior   | asunto   | descripcion   | anexos   |
      | <atencionPreferencial> | <indicativoVia> | <numeroVia> | <apendice> | <orientacion> | <numeroCruce> | <apendice2> | <orientacion2> | <numeroPuerta> | <interior> | <asunto> | <descripcion> | <anexos> |
    Entonces aparece el mensaje de confirmación con el texto '<mensaje>'

    Ejemplos:
      | tipoPersona     | tipoDocumento        | numeroDocumento | nombres | apellidos | genero    | pais        | departamento | ciudad         | indicativoVia | numeroVia | apendice | orientacion | numeroCruce | apendice2 | orientacion2 | numeroPuerta | interior | email                      | telefono   | solicitudInformacion | atencionPreferencial | indicativoVia | numeroVia | apendice | orientacion | numeroCruce | apendice2 | orientacion2 | numeroPuerta | interior | asunto            | descripcion       | anexos |
      | Persona Natural | Cédula de Ciudadanía | 1080935788      | luis    | manrique  | MASCULINO | CO-Colombia | 05-ANTIOQUIA | 05001-MEDELLIN | Calle         | 5         | AB       | Este        | 2           | AC        | Oeste        | 3            | 5        | ismaelcarvajal@outlook.com | 3118473067 | Si                   | Si                   | Autopista     | 3         | AF       | Este        | 3           | AB        | Norte        | 4            | 5        | radicacion prueba | radicacion prueba | No     |


  @ReportesCiudadanos-RadicacionInformacionEspecifica
  Esquema del escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para ingresar la informacion especifica
    Cuando hace clic en continuar e ingresa la siguiente informacion
      | atencionPreferencial   | indicativoVia   | numeroVia   | apendice   | orientacion   | numeroCruce   | apendice2   | orientacion2   | numeroPuerta   | interior   | asunto   | descripcion   | anexos   |
      | <atencionPreferencial> | <indicativoVia> | <numeroVia> | <apendice> | <orientacion> | <numeroCruce> | <apendice2> | <orientacion2> | <numeroPuerta> | <interior> | <asunto> | <descripcion> | <anexos> |
    Entonces aparece el mensaje de confirmacion de informacion especifica

    Ejemplos:
      | atencionPreferencial | indicativoVia | numeroVia | apendice | orientacion | numeroCruce | apendice2 | orientacion2 | numeroPuerta | interior | asunto            | descripcion       | anexos |
      | No                   | Autopista     | 3         | AF       | Este        | 3           | AB        | Norte        | 4            | 5        | radicacion prueba | radicacion prueba | No     |


  @ReportesCiudadanos-ConsultarPQRSD
  Esquema del escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para consultar una PQRSD
    Cuando hace clic sobre reporte ciudadanos y realiza una consulta de PQRSD
      | consultarPQRSD   |
      | <consultarPQRSD> |
    Entonces aparece la informacion sobre la PQRSD

    Ejemplos:
      | consultarPQRSD |
      | 202250000237   |


  @ReportesCiudadanos-QuieroEntenderQueSonPQRSD
  Escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para saber qué son PQRSD
    Cuando hace clic sobre reporte ciudadanos y quiere entender que es una PQRSD
    Entonces aparece la informacion sobre la PQRSD


  @ReportesCiudadanos-PuntosCriticosDeBasuras
  Esquema del escenario: Escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para hacer un reporte de puntos criticos
    Cuando ingresa esta informacion
      | direccion   | puntoReferencia   | descripcion   | correo   |
      | <direccion> | <puntoReferencia> | <descripcion> | <correo> |
    Entonces aparece una confirmacion

    Ejemplos:
      | direccion | puntoReferencia    | descripcion  | correo                     |
      | CL 44     | Al lado del parque | plaza civica | ismaelcarvajal@outlook.com |


  @ReportesCiudadanos-Huecos-Y-Baches
  Esquema del escenario: Escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para hacer un reporte de huecos y baches
    Cuando ingresa la informacion necesaria
      | direccion   | puntoReferencia   | descripcion   | correo   |
      | <direccion> | <puntoReferencia> | <descripcion> | <correo> |
    Entonces aparece una confirmacion de la solicitud

    Ejemplos:
      | direccion | puntoReferencia    | descripcion  | correo                     |
      | CL 44     | Al lado del parque | plaza civica | ismaelcarvajal@outlook.com |


  @ReportesCiudadanos-Nido-De-Abejas
  Esquema del escenario: Escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para hacer un reporte de nido de abejas
    Cuando ingresa la informacion relacionada
      | direccion   | puntoReferencia   | descripcion   | correo   | tipoDaño   |
      | <direccion> | <puntoReferencia> | <descripcion> | <correo> | <tipoDaño> |
    Entonces aparece una confirmacion de la solicitud realizada

    Ejemplos:
      | direccion | puntoReferencia    | descripcion  | correo                     | tipoDaño |
      | CL 44     | Al lado del parque | plaza civica | ismaelcarvajal@outlook.com | mes      |


  @ReportesCiudadanos-Alumbrado-Publico
  Esquema del escenario: Escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para hacer un reporte de alumbrado publico
    Cuando ingresa la informacion para el reporte
      | direccion   | puntoReferencia   | descripcion   | correo   | tipoDaño   | descripcionDaño   | nombreReporta   | numeroReporta   | correoContacto   |
      | <direccion> | <puntoReferencia> | <descripcion> | <correo> | <tipoDaño> | <descripcionDaño> | <nombreReporta> | <numeroReporta> | <correoContacto> |
    Entonces aparece una confirmacion de la solicitud realizada

    Ejemplos:
      | direccion | puntoReferencia    | descripcion  | correo                     | tipoDaño         | descripcionDaño | nombreReporta | numeroReporta | correoContacto             |
      | CL 44     | Al lado del parque | plaza civica | ismaelcarvajal@outlook.com | Cable chispeando | dato de...      | Albert        | 3118552354    | ismaelcarvajal@outlook.com |


  @ReportesCiudadanos-Contenedores-De-Basura
  Esquema del escenario: Escenario: Hacer reportes desde la aplicacion superapp
    Dado que 'Ismael' ingresa a la aplicacion superapp para hacer un reporte de contenedores de basura
    Cuando ingresa la informacion para hacer el reporte
      | direccion   | puntoReferencia   | descripcion   | correoContacto   |
      | <direccion> | <puntoReferencia> | <descripcion> | <correoContacto> |
    Entonces aparece una confirmacion de la solicitud de contenedores de basura

    Ejemplos:
      | direccion | puntoReferencia    | descripcion  | correoContacto                     |
      | CL 44     | Al lado del parque | plaza civica | ismaelcarvajal@outlook.com |