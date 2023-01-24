package superapp.tasks.medellinencifras.seguridad;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.*;

public class ViolenciaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MEDELLIN_EN_CIFRAS),
                Click.on(BTN_MEDELLIN_EN_CIFRAS),
                WaitElement.isClickable(BTN_SEGURIDAD),
                Click.on(BTN_SEGURIDAD),
                WaitElement.isClickable(BTN_VIOLENCIA_SEXUAL),
                Click.on(BTN_VIOLENCIA_SEXUAL),
                WaitElement.isClickable(ACEPTAR_COOKIES),
                Click.on(ACEPTAR_COOKIES)
        );

    }

    public static ViolenciaTask seguridadTask() {
        return instrumented(ViolenciaTask.class);
    }
}
