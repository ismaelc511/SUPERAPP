package superapp.interactions.scroll;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import superapp.utils.AndroidObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarTexto extends AndroidObject implements Interaction{

	private String text;

    public ValidarTexto(String text) {

        this.text = text;
    }

    @Override
    @Step("Validar Texto")
    public <T extends Actor> void performAs(T actor) {
        ValidarTexto(actor, text);
    }



    public static Interaction validarTexto(String text) {
        return instrumented(ValidarTexto.class, text);
    }
}
