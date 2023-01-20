package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.waits.WaitElement;
import superapp.models.reportesciudadanos.ConsultarPQRSD;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.BTN_CONSULTAR_RADICADO;

public class QuieroEntenderQueSonPQRS implements Task {


    public QuieroEntenderQueSonPQRS() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_REPORTES_CIUDADANOS),
                Click.on(BTN_REPORTES_CIUDADANOS),
                WaitElement.isClickable(BTN_REALIZAR_O_CONSULTAR),
                Click.on(BTN_REALIZAR_O_CONSULTAR),
                WaitElement.isClickable(BTN_ACEPTAR_RESPETADO_CIUDADANO),
                Click.on(BTN_ACEPTAR_RESPETADO_CIUDADANO),
                WaitElement.isClickable(BTN_QUIERO_ENTENDER),
                Click.on(BTN_QUIERO_ENTENDER),
                Scroll.scrollUnaVista(),
                WaitElement.isClickable(ATRAS),
                Click.on(ATRAS),
                WaitElement.isClickable(ATRAS),
                Click.on(ATRAS)
        );

    }

    public static QuieroEntenderQueSonPQRS quieroEntenderQueSonPQRS() {
        return instrumented(QuieroEntenderQueSonPQRS.class);
    }
}
