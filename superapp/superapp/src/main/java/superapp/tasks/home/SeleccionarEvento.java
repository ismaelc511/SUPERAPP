package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.BuscadorPage.EVENTOS_Y_JORNADAS;
import static superapp.userinterfaces.home.BuscadorPage.LBL_EVENTOS;

public class SeleccionarEvento implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(EVENTOS_Y_JORNADAS),
                Click.on(EVENTOS_Y_JORNADAS),
                WaitElement.isClickable(LBL_EVENTOS),
                Click.on(LBL_EVENTOS));
    }

    public static Performable seleccionarEvento() {
        return instrumented(SeleccionarEvento.class);
    }
}
