package superapp.interactions.comunes;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import superapp.utils.AndroidObject;

public class ValidarTextoQueContengaX extends AndroidObject implements Interaction{

	private String text;

    public ValidarTextoQueContengaX(String text) {
        this.text = text;
    }

    @Override
    @Step("Validar un texto donde el texto visible contenga la cadena ingresada en alguna parte del mismo.")
    public <T extends Actor> void performAs(T actor) {
        ElTextoContiene(actor, text);

    }

    public static Interaction elTextoContiene(String text) {
        return instrumented(ValidarTextoQueContengaX.class, text);
    }
}
