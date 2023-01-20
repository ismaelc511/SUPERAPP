package superapp.interactions.comunes;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import superapp.utils.AndroidObject;

public class Atras extends AndroidObject implements Interaction{

    @Override
    @Step("Ir atrás en la aplicación")
    public <T extends Actor> void performAs(T actor) {
        Atras(actor);
    }

    public static Interaction irAtras() {
        return instrumented(Atras.class);
    }
}
