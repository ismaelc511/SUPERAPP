package superapp.tasks.movilidad;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import superapp.interactions.waits.WaitElement;
import superapp.models.autenticacion.Credencial;
import superapp.models.movilidad.InfoPicoYPlaca;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.movilidad.InfoPicoYPlacaPage.*;

public class ConsultaDeExentos implements Task {

    InfoPicoYPlaca placa;


    public ConsultaDeExentos(InfoPicoYPlaca placa) {
        this.placa = placa;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitElement.isClickable(BTN_MOVILIDAD),
                Click.on(BTN_MOVILIDAD),
                WaitElement.isEnable(BTN_CONSULTA_EXENTOS),
                Click.on(BTN_CONSULTA_EXENTOS),
                WaitElement.isClickable(DIGITAR_PLACA),
                Enter.theValue(placa.getPlaca()).into(DIGITAR_PLACA),
                WaitElement.isClickable(BTN_CONSULTAR),
                Click.on(BTN_CONSULTAR),
                WaitElement.isClickable(BTN_ACEPTAR),
                Click.on(BTN_ACEPTAR)
        );

    }

    public static ConsultaDeExentos consultaDeExentos(InfoPicoYPlaca placa) {
        return instrumented(ConsultaDeExentos.class, placa);
    }
}
