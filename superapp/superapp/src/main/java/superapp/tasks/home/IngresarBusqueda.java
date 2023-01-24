package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.home.Busqueda;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.BuscadorPage.*;
import static superapp.userinterfaces.home.EmpleoPage.ESCONDER_TECLADO_EMPLEO;

public class IngresarBusqueda implements Task {

    Busqueda busqueda;

    public IngresarBusqueda(Busqueda busqueda) {
        this.busqueda = busqueda;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(INPUT_BUSCADOR),
                Enter.theValue(busqueda.getDatoBusqueda()).into(INPUT_BUSCADOR),
                WaitFor.aTime(3000)
                //WaitElement.isClickable(EVENTOS),
                //Click.on(EVENTOS)

        );
    }

    public static Performable buscar(Busqueda busqueda) {
        return instrumented(Buscador.class, busqueda);
    }
}
