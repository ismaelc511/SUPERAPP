package superapp.tasks.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.autenticacion.SignOffPage.*;

public class SignOffGoogleTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_CERRAR_SESION_GOOGLE),
                Click.on(BTN_CERRAR_SESION_GOOGLE)

        );

    }

    public static SignOffGoogleTask cerrarSesionGoogle() {
        return instrumented(SignOffGoogleTask.class);
    }
}
