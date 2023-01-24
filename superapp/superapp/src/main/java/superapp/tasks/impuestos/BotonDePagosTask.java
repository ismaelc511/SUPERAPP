package superapp.tasks.impuestos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.autenticacion.impuestos.ImpuestosPage.*;

public class BotonDePagosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitElement.isClickable(BTN_DE_PAGOS),
            Click.on(BTN_DE_PAGOS),
            WaitElement.isClickable(BTN_PAGO_IMPUESTOS),
            Click.on(BTN_PAGO_IMPUESTOS),
            WaitElement.isClickable(ERROR_PAGO_IMPUESTOS),
            Click.on(ERROR_PAGO_IMPUESTOS),
            //WaitElement.isClickable(ACEPTAR_ERROR),
            //Click.on(ACEPTAR_ERROR),
            WaitElement.isClickable(HISTORIAL_TRANSACCIONES),
            Click.on(HISTORIAL_TRANSACCIONES),
            WaitElement.isClickable(ACEPTAR_ERROR_HISTORIAL),
            Click.on(ACEPTAR_ERROR_HISTORIAL),
            WaitElement.isClickable(DEVOLVERSE_A_BOTON_DE_PAGOS),
            Click.on(DEVOLVERSE_A_BOTON_DE_PAGOS)

        );

    }

    public static BotonDePagosTask botonDePagos() {
        return instrumented(BotonDePagosTask.class);
    }
}
