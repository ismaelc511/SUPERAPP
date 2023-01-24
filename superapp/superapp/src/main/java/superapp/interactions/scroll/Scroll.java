package superapp.interactions.scroll;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import superapp.utils.AndroidObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Scroll extends AndroidObject implements Interaction {

    @Override
    @Step("Realiza Scroll una vez hacia abajo")
    public <T extends Actor> void performAs(T actor) {
        UnScrollAbajo(actor);
    }

    public static Interaction scrollUnaVista() {
        return instrumented(Scroll.class);
    }

}