package superapp.interactions.scroll;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import superapp.utils.AndroidObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollHorizontalId extends AndroidObject implements Interaction {


        private String Id;

        public ScrollHorizontalId(String Id) {

            this.Id = Id;
        }

        @Override
        @Step("Busca el elemento por ID y realiza scroll horizontal hacia la derecha una vez")
        public <T extends Actor> void performAs(T actor) {
            ScrollHorizontalId(actor, Id);
        }

        public static Interaction scrollHorizontalId(String Id) {
            return instrumented(ScrollHorizontalId.class, Id);
        }
    }


