package superapp.tasks.home;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.home.EmergenciaPage.*;
import static superapp.userinterfaces.home.HomePage.BTN_SALTAR;

public class Emergencias implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_EMERGENCIAS),
                Click.on(BTN_EMERGENCIAS),
                WaitElement.isClickable(BTN_AYUDA_123),
                Click.on(BTN_AYUDA_123)
                );
    }

    public static Performable emergencias() {
        return instrumented(Emergencias.class);
    }
}
