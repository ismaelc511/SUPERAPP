package superapp.tasks.impuestos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import superapp.interactions.waits.WaitElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static superapp.userinterfaces.autenticacion.impuestos.ImpuestosPage.*;

public class IndustriaYComercioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitElement.isClickable(DEVOLVER),
                //Click.on(DEVOLVER),
                WaitElement.isClickable(BTN_INDUSTRIA_Y_COMERCIO),
                Click.on(BTN_INDUSTRIA_Y_COMERCIO),
                WaitElement.isClickable(BTN_INSCRITO_NO_INSCRITO),
                Click.on(BTN_INSCRITO_NO_INSCRITO),
                WaitElement.isClickable(DESCARGAR_DOCUMENTO),
                Click.on(DESCARGAR_DOCUMENTO),
                WaitElement.isClickable(ACEPTAR_ALERTA_DESCARGA),
                Click.on(ACEPTAR_ALERTA_DESCARGA),
                WaitElement.isClickable(ACEPTAR_ALERTA_ERROR ),
                Click.on(ACEPTAR_ALERTA_ERROR),
                WaitElement.isClickable(CANCELACION),
                Click.on(CANCELACION),
                WaitElement.isClickable(ACEPTAR_ALERTA_ERROR),
                Click.on(ACEPTAR_ALERTA_ERROR),
                WaitElement.isClickable(ACTIVO_E_INACTIVO),
                Click.on(ACTIVO_E_INACTIVO),
                WaitElement.isClickable(ERROR_ACTIVO_E_INACTIVO),
                Click.on(ERROR_ACTIVO_E_INACTIVO),
                WaitElement.isClickable(BTN_ESTAR_AL_DIA),
                Click.on(BTN_ESTAR_AL_DIA),
                WaitElement.isClickable(ERROR_ESTAR_AL_DIA),
                Click.on(ERROR_ESTAR_AL_DIA),
                WaitElement.isClickable(BTN_DEVOLVER),
                Click.on(BTN_DEVOLVER),
                WaitElement.isClickable(BTN_DE_PAGOS)

        );

    }

    public static IndustriaYComercioTask industriaYComercio() {
        return instrumented(IndustriaYComercioTask.class);
    }
}
