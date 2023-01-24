package superapp.tasks.tacitadeplata;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.comunes.ClickElement;
import superapp.interactions.comunes.ClickElementByText;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.reportesciudadanos.DatosAlumbradoPublico;
import superapp.models.tacitadeplata.DatosTacitaDePlata;
import superapp.tasks.reportesciudadanos.AlumbradoPublicoTask;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.BTN_CONTINUAR_DAÑO;
import static superapp.userinterfaces.tacitadeplata.TacitaPage.*;

public class TacitaDePlataTask implements Task {

    DatosTacitaDePlata datosTacitaDePlata;

    public TacitaDePlataTask(DatosTacitaDePlata datosTacitaDePlata) {
        this.datosTacitaDePlata = datosTacitaDePlata;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_TACITA_PLATA),
                Click.on(BTN_TACITA_PLATA),
                WaitElement.isClickable(SELECCIONAR_BARRIO),
                Click.on(SELECCIONAR_BARRIO),
                ScrollAndClick.scrollAndClick(datosTacitaDePlata.getBarrio()),
                WaitElement.isClickable(BTN_CONOCER),
                Click.on(BTN_CONOCER),
                WaitElement.isClickable(RUTA),
                Click.on(RUTA)
                //ClickElementByText.clickElementByText("Ruta Z6R51WS")
                //ScrollAndClick.scrollAndClick(datosTacitaDePlata.getRuta())
        );

    }

    public static TacitaDePlataTask tacitaDePlataTask(DatosTacitaDePlata datosTacitaDePlata) {
        return instrumented(TacitaDePlataTask.class, datosTacitaDePlata);
    }
}
