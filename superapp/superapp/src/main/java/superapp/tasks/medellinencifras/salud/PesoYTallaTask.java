package superapp.tasks.medellinencifras.salud;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.medellinencifras.SeguridadPage.*;

public class PesoYTallaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MEDELLIN_EN_CIFRAS),
                Click.on(BTN_MEDELLIN_EN_CIFRAS),
                WaitElement.isClickable(BTN_SALUD),
                Click.on(BTN_SALUD),
                WaitElement.isClickable(BTN_PESO_Y_TALLA),
                Click.on(BTN_PESO_Y_TALLA),
                WaitElement.isClickable(ACEPTAR_COOKIES),
                Click.on(ACEPTAR_COOKIES)
        );

    }

    public static PesoYTallaTask pesoYTallaTask() {
        return instrumented(PesoYTallaTask.class);
    }
}
