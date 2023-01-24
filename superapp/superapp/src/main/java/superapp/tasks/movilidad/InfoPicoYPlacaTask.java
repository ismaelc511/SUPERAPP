package superapp.tasks.movilidad;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.scroll.ScrollHorizontal;
import superapp.interactions.waits.WaitElement;
import superapp.models.movilidad.InfoPicoYPlaca;
import superapp.models.tacitadeplata.DatosTacitaDePlata;
import superapp.tasks.tacitadeplata.TacitaDePlataTask;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.movilidad.InfoPicoYPlacaPage.*;
import static superapp.userinterfaces.tacitadeplata.TacitaPage.*;
import static superapp.userinterfaces.tacitadeplata.TacitaPage.RUTA;

public class InfoPicoYPlacaTask implements Task {

    InfoPicoYPlaca placa;

    public InfoPicoYPlacaTask(InfoPicoYPlaca placa) {
        this.placa = placa;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitElement.isEnable(CAMBIAR_PAGINA),
                //Click.on(CAMBIAR_PAGINA),
                WaitElement.isClickable(BTN_MOVILIDAD),
                Click.on(BTN_MOVILIDAD),
                WaitElement.isEnable(BTN_INFO_PICO_Y_PLACA),
                Click.on(BTN_INFO_PICO_Y_PLACA),
                WaitElement.isClickable(DIGITAR_PLACA),
                Enter.theValue(placa.getPlaca()).into(DIGITAR_PLACA),
                WaitElement.isClickable(BTN_CONSULTAR),
                Click.on(BTN_CONSULTAR),
                WaitElement.isClickable(BTN_ACEPTAR),
                Click.on(BTN_ACEPTAR)
        );

    }

    public static InfoPicoYPlacaTask infoPicoYPlacaTask(InfoPicoYPlaca placa) {
        return instrumented(InfoPicoYPlacaTask.class, placa);
    }
}
