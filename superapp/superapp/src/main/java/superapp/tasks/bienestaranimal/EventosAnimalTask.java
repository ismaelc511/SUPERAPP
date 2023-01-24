package superapp.tasks.bienestaranimal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.*;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.BTN_HEMBRAS;

public class EventosAnimalTask implements Task {

    public EventosAnimalTask() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_BIENESTAR_ANIMAL),
                Click.on(BTN_BIENESTAR_ANIMAL),
                WaitElement.isClickable(BTN_EVENTOS_Y_JORNADAS),
                Click.on(BTN_EVENTOS_Y_JORNADAS),
                WaitElement.isClickable(ELECCION_EVENTOS),
                Click.on(ELECCION_EVENTOS),
                WaitElement.isClickable(BTN_AGENDAR),
                Click.on(BTN_AGENDAR),
                //WaitElement.isClickable(BAJAR_TECLADO),
                //Click.on(BAJAR_TECLADO),
                WaitElement.isClickable(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)



        );

    }

    public static EventosAnimalTask eventosAnimalTask() {
        return instrumented(EventosAnimalTask.class);
    }
}
