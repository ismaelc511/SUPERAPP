package superapp.interactions.comunes;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import superapp.utils.AndroidObject;

import static net.serenitybdd.screenplay.Tasks.instrumented;

    public class ClickElementByText extends AndroidObject implements Interaction {

        private String Text;

        public ClickElementByText(String Text ) {
            this.Text = Text;
        }

        @Override
        @Step("Busca un elemento por texto y le da click")
        public <T extends Actor> void performAs(T actor) {
            ClickByText(actor, Text);
        }



        public static Interaction clickElementByText(String Text) {
            return instrumented(ClickElementByText.class, Text);
        }
    }


