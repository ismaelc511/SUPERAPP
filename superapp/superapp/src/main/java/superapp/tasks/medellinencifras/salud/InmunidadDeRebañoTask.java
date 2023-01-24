package superapp.tasks.medellinencifras.salud;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.*;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.ACEPTAR_COOKIES;

public class InmunidadDeRebañoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MEDELLIN_EN_CIFRAS),
                Click.on(BTN_MEDELLIN_EN_CIFRAS),
                WaitElement.isClickable(BTN_SALUD),
                Click.on(BTN_SALUD),
                WaitElement.isClickable(INMUNIDAD_DE_REBANO),
                Click.on(INMUNIDAD_DE_REBANO),
                WaitElement.isClickable(ACEPTAR_COOKIES),
                Click.on(ACEPTAR_COOKIES)
        );

    }

    public static InmunidadDeRebañoTask inmunidadDeRebañoTask() {
        return instrumented(InmunidadDeRebañoTask.class);
    }
}
