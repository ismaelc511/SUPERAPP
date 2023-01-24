package superapp.models.registro;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class DatosPersonales {


    private String tipoPersona;

    private String nombres;

    @Getter
    @Setter
    private String apellidos;

    private String tipoDocumento;

    private String numeroDocumento;

    private String diaNacimiento;

    private String mesNacimiento;

    private String añoNacimiento;

    private String correo;

    private String genero;

    private String numeroCelular;

    private String numeroFijo;

    private String sexo;

    private String etnia;

    private String orientacionSexual;

    private String identidadDeGenero;
}
