package superapp.tasks.autentication;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.autenticacion.SignOffPage.*;

public class SingOffTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_CERRAR_SESION),
                Click.on(BTN_CERRAR_SESION)
                //WaitElement.isClickable(FLECHA_ATRAS),
                //Click.on(FLECHA_ATRAS),
                //WaitElement.isClickable(BTN_EQUIS),
                //Click.on(BTN_EQUIS)

        );

    }

    public static SingOffTask cerrarSesion() {
        return instrumented(SingOffTask.class);
    }
}
