package superapp.models.autenticacion;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Credencial {

    private String email;

    private String password;

    private String telefono;

    private String nombre;

    private String direccion;

    private String cedula;
}
