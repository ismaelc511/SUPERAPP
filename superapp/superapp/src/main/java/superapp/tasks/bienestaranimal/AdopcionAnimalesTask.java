package superapp.tasks.bienestaranimal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollVertical;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.bienestaranimal.BienestarAnimalPage.*;

public class AdopcionAnimalesTask implements Task {


    public AdopcionAnimalesTask() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_BIENESTAR_ANIMAL),
                Click.on(BTN_BIENESTAR_ANIMAL),
                WaitElement.isClickable(BTN_ADOPCION),
                Click.on(BTN_ADOPCION),
                WaitElement.isClickable(FILTRAR),
                Click.on(FILTRAR),
                WaitElement.isClickable(ESPECIE_ANIMAL),
                Click.on(ESPECIE_ANIMAL),
                WaitElement.isClickable(CANINO_ESPECIE),
                Click.on(CANINO_ESPECIE),
                WaitElement.isClickable(BTN_BUSCAR_AHORA),
                Click.on(BTN_BUSCAR_AHORA),
                WaitElement.isClickable(BTN_MACHOS),
                Click.on(BTN_MACHOS),
                WaitElement.isClickable(BTN_HEMBRAS),
                Click.on(BTN_HEMBRAS),
                WaitElement.isClickable(FILTRAR),
                Click.on(FILTRAR),
                WaitElement.isClickable(ESPECIE_ANIMAL_CANINO),
                Click.on(ESPECIE_ANIMAL_CANINO),
                WaitElement.isClickable(FELINO_ESPECIE),
                Click.on(FELINO_ESPECIE),
                WaitElement.isClickable(BTN_BUSCAR_AHORA),
                Click.on(BTN_BUSCAR_AHORA),
                WaitElement.isClickable(BTN_MACHOS),
                Click.on(BTN_MACHOS),
                WaitElement.isClickable(BTN_HEMBRAS),
                Click.on(BTN_HEMBRAS)



        );

    }

    public static AdopcionAnimalesTask adopcionAnimalesTask() {
        return instrumented(AdopcionAnimalesTask.class);
    }
}
