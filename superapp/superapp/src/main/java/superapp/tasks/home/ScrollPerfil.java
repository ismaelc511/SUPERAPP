package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.PerfilPage.TXT_TELEFONO;


public class ScrollPerfil implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollAndClick.scrollAndClick("Teléfono fijo"),
                WaitElement.isClickable(TXT_TELEFONO),
                Click.on(TXT_TELEFONO)
               );
    }

    public static Performable realizarScroll() {
        return instrumented(ScrollPerfil.class);
    }
}
