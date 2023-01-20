package superapp.models.autenticacion;

import lombok.Getter;
import lombok.Setter;

public class Credencial {

    @Getter @Setter
    private String email;
    @Getter @Setter
    private String password;
}
