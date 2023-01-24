package superapp.tasks.reportesciudadanos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import superapp.interactions.scroll.Scroll;
import superapp.interactions.scroll.ScrollAndClick;
import superapp.interactions.waits.WaitElement;
import superapp.interactions.waits.WaitFor;
import superapp.models.registro.DatosComplementarios;
import superapp.models.reportesciudadanos.ConsultarPQRSD;
import superapp.tasks.registro.RegistrarInformacionComplementariaTasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.registro.RegisterPage.*;
import static superapp.userinterfaces.reportesciudadanos.ReportesPage.*;

public class ConsultarPQRS implements Task {

    ConsultarPQRSD consultarPQRSD;

    public ConsultarPQRS(ConsultarPQRSD consultarPQRSD) {
        this.consultarPQRSD = consultarPQRSD;
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
                WaitElement.isClickable(BTN_CONSULTAR_ESTADO),
                Click.on(BTN_CONSULTAR_ESTADO),
                Enter.theValue(consultarPQRSD.getConsultarPQRSD()).into(INPUT_CONULTA_RADICADO),
                WaitElement.isClickable(BTN_CONSULTAR_RADICADO),
                Click.on(BTN_CONSULTAR_RADICADO)
        );

    }

    public static ConsultarPQRS consultarPQRS(ConsultarPQRSD consultarPQRSD) {
        return instrumented(ConsultarPQRS.class, consultarPQRSD);
    }
}
