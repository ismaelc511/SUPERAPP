package superapp.tasks.medellinencifras.educacionycultura;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.*;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.ACEPTAR_COOKIES;

public class PruebasSaber11Task implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MEDELLIN_EN_CIFRAS),
                Click.on(BTN_MEDELLIN_EN_CIFRAS),
                WaitElement.isClickable(BTN_EDUCACION_Y_CULTURA),
                Click.on(BTN_EDUCACION_Y_CULTURA),
                WaitElement.isClickable(BTN_PRUEBAS_SABER_11),
                Click.on(BTN_PRUEBAS_SABER_11),
                WaitElement.isClickable(ACEPTAR_COOKIES),
                Click.on(ACEPTAR_COOKIES)
        );

    }

    public static PruebasSaber11Task pruebasSaber11Task() {
        return instrumented(PruebasSaber11Task.class);
    }
}
