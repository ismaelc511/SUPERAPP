# language: es

Característica: Ver lugares de turismo en la aplicacion de SuperApp
  dada la aplicacion de SuperApp
  Como usuario de la aplicacion
  Quiero poder ver lugares de turismo


  @Turismo
  Esquema del escenario: Ver lugares de turismo desde la aplicacion de superapp
    Dado que Ismael ingresa a la aplicacion superapp para ver lugares de turismo
    Cuando hace clic sobre el boton de turismo e ingresa el lugar al que quiere ir
      | lugar   |
      | <lugar> |
    Entonces me muestra informacion sobre el lugar ingresado

    Ejemplos:

      | lugar |
      | DAGRD |

