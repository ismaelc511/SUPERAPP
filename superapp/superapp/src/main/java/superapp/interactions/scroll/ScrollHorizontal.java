package superapp.interactions.scroll;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import superapp.utils.AndroidObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollHorizontal extends AndroidObject implements Interaction {

        private String labelText;
        private String instance;

        public ScrollHorizontal(String instance, String labelText ) {
            this.labelText = labelText;
            this.instance = instance;
        }

        @Override
        @Step("Realiza scroll horizontal en busca de un elemento y le da click")
        public <T extends Actor> void performAs(T actor) {
            ScrollHorizontal(actor, instance, labelText);
        }

        public static Interaction scrollHorizontal(String instance, String labelText) {
            return instrumented(ScrollHorizontal.class, instance, labelText);
        }
    }


