package superapp.tasks.medellinencifras.educacionycultura;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.*;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.ACEPTAR_COOKIES;

public class InglesEnMedellinTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MEDELLIN_EN_CIFRAS),
                Click.on(BTN_MEDELLIN_EN_CIFRAS),
                WaitElement.isClickable(BTN_EDUCACION_Y_CULTURA),
                Click.on(BTN_EDUCACION_Y_CULTURA),
                WaitElement.isClickable(BTN_INGLES_EN_MEDELLIN),
                Click.on(BTN_INGLES_EN_MEDELLIN),
                WaitElement.isClickable(ACEPTAR_COOKIES),
                Click.on(ACEPTAR_COOKIES)
        );

    }

    public static InglesEnMedellinTask inglesEnMedellinTask() {
        return instrumented(InglesEnMedellinTask.class);
    }
}
