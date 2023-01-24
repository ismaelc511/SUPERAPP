package superapp.tasks.turismo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.models.tacitadeplata.DatosTacitaDePlata;
import superapp.models.turismo.LugarTuristico;
import superapp.tasks.tacitadeplata.TacitaDePlataTask;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.tacitadeplata.TacitaPage.*;
import static superapp.userinterfaces.tacitadeplata.TacitaPage.RUTA;
import static superapp.userinterfaces.turismo.TurismoPage.*;

public class BuscarLugarTuristicoTask implements Task {

    LugarTuristico lugarTuristico;

    public BuscarLugarTuristicoTask(LugarTuristico lugarTuristico) {
        this.lugarTuristico = lugarTuristico;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_TURISMO),
                Click.on(BTN_TURISMO),
                WaitElement.isClickable(SITIOS_TURISTICOS),
                Click.on(SITIOS_TURISTICOS),
                WaitElement.isClickable(ELEGIR_SITIO),
                Click.on(ELEGIR_SITIO)
        );

    }

    public static BuscarLugarTuristicoTask buscarLugarTuristicoTask(LugarTuristico lugarTuristico) {
        return instrumented(BuscarLugarTuristicoTask.class, lugarTuristico);
    }
}
