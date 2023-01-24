package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.waits.WaitElement;
import superapp.models.home.Busqueda;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.BuscadorPage.INPUT_BUSCADOR;

public class Buscador implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(INPUT_BUSCADOR),
                Click.on(INPUT_BUSCADOR)
                //Enter.theValue(busqueda.getDatoBusqueda()).into(INPUT_BUSCADOR)
        );
    }

    public static Performable buscar() {
        return instrumented(Buscador.class);
    }
}
